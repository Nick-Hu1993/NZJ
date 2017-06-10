package org.tool;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperties {
	public String getP(String str){
		try {
			Properties p = new Properties();
//			InputStream is = new BufferedInputStream(new FileInputStream("/param.properties"));
			InputStream is = getClass().getResourceAsStream("/param.properties");
			p.load(is);
			String v= p.getProperty(str);
			return v;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
