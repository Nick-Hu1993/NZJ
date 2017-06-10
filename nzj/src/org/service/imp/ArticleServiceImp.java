package org.service.imp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.dao.ArticleDao;
import org.model.Article;
import org.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.JsonObject;
import org.tool.readProperties;

@Service
public class ArticleServiceImp implements ArticleService{
	@Autowired
	private ArticleDao aDao;
	
	@Override
	public Object addArticle(HttpServletRequest request, String title,
			String digest, String content) {

		String fileString="";			//用于存储拼接好的html文件，和图片文件的文件名，用于删除
		
//		System.out.println("	title:" + title);
//		System.out.println("	digest:" + digest);
//		System.out.println("	content:" + content+"\n");

		String rPath = request.getSession().getServletContext()
				.getRealPath("/"); // 项目根目录

//		System.out.println("	项目磁盘根目录：" + rPath);

		String upDir = "ueditor" + File.separator + "jsp" + File.separator
				+ "upload" + File.separator + "article" + File.separator
				+ ChangeTime.currentDate(); 					// 生成保存的文件夹路径

		String targetDir = rPath + upDir; 						// 完整的目标文件夹目录
//		System.out.println("	完整目标文件夹：" + targetDir);

		File dir = new File(targetDir);
		if (!dir.exists() && !dir.isDirectory()) {				//检测文件夹是否存在，不存在则创建
			dir.mkdirs();
		}

		String fName =new Date().getTime()+"_"+new Random().nextInt(20)+".html";
		
		fileString+=ChangeTime.currentDate()+"-"+fName+"-";
		
		String targetFile = targetDir + File.separator + fName; // 目标文件
		System.out.println("	生成的目标文件:" + targetFile);

		// ========================将文件中的图片的url转到该目标目录下============================
		String p = "ueditor.*?(.jpg|.png|.gif)";
		Pattern pattern = Pattern.compile(p);
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			String iSrc = matcher.group(); // 图片的src地址
			System.out.println("	匹配的src："+iSrc);
			
			String originFile = rPath+iSrc.replace("/", File.separator);	//原始图片路径
//			System.out.println("	原始图片路径:"+originFile);
			
			String t[] = iSrc.split("/");
			fileString+=t[5]+"-";
			
			String newFile = originFile.replaceAll("temp", "article");		//新图片文件路径
			
			File file = new File(originFile);
			file.renameTo(new File(newFile));				//通过修改文件名来移动文件
		}

		System.out.println("	文件串："+fileString);
		
		content= content.replaceAll("temp", "article");		//修改图片请求的url，从temp文件夹转到article
		
		try {
			FileOutputStream fos = new FileOutputStream(targetFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String htmlContent = "<!DOCTYPE html><html lang='en'><head><meta charset='UTF-8'><title>Document</title></head><body>"+content+"</body></html>";
			
			bw.write(htmlContent);
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Map<String, Object> map = new HashMap<String, Object>();
//		String url = upDir.replace('\\','/');
		
		String url= new readProperties().getP("server")+upDir.replace("\\", "/")+"/"+fName;
		
		map.put("result", url);
		
		Article a = new Article();
		a.setTitle(title);
		a.setDigest(digest);
		a.setTime(new Date().getTime()/1000);
		a.setUrl(url);
		a.setFstr(fileString);
		if(aDao.addArticle(a)!=-1)
			return JsonObject.getResult(1, "添加文章成功", url);
		else
			return JsonObject.getResult(0, "添加文章失败", false);
	}

	@Override
	public Object getArticleList(Integer start, Integer limit) {
		List<Article> li = aDao.getArticleList(start, limit);
		long count = aDao.getArticleCount();
		
		Map<String, Object> map = new HashMap<>();
		map.put("result", li);
		map.put("count", count);
		
		return JsonObject.getResult(1, "获取文章列表", map);
	}

	@Override
	public Object deleteArticle(HttpServletRequest request,Long id) {
		String fstr = aDao.getArticleFstrById(id);
		
		String rPath = request.getSession().getServletContext()
				.getRealPath("/");
		
		String upDir = "ueditor" + File.separator + "jsp" + File.separator
				+ "upload" + File.separator + "article" + File.separator; 					// 生成保存的文件夹路径
		
		if(fstr!=null){
			String s[]=fstr.split("-");
			String sDir = rPath+upDir+s[0];				//要删除的文件所在的文件夹
//			System.out.println(sDir);
			File folder = new File(sDir);
			if(folder.exists()){
				File[] files = folder.listFiles();
				for(File f:files){
					if(fstr.contains(f.getName())){
						System.out.println("	删除:"+f.getName());
						f.delete();
						//删除
					}
				}
			}
		}
		if(aDao.deleteArticle(id))
			return JsonObject.getResult(1, "删除文章成功", true);
		else
			return JsonObject.getResult(0, "删除文章失败", false);
	}

	@Override
	public Object getSearchArticleList(String key, Integer start, Integer limit) {
		List<Article> li = aDao.getSearchArticleList(key, start, limit);
		long count = aDao.getSearchArticleCount(key);
		
		Map<String, Object> map = new HashMap<>();
		map.put("result", li);
		map.put("count", count);
		
		return JsonObject.getResult(1, "获取搜索后的文章列表", map);
	}

	@Override
	public Object updateArticle(long id, String title, String digest) {
		if(title==null){
			title="";
		}
		if(digest==null){
			digest="";
		}
		if(aDao.updateArticle(id, title, digest))
			return JsonObject.getResult(1, "修改文章标题、摘要成功", true);
		else
			return JsonObject.getResult(0, "修改文章标题、摘要失败", false);
	}

}
