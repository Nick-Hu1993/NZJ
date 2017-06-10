package org.test;

/**
 * 字符串转二进制，二进制转字符串
 * @author ZGJ
 *
 */
public class test10 {
	public static void main(String[] args) {
		String a="sdfjdhf阿萨德234看";
//		byte b = Byte.parseByte(a);
//		b<<;
		
		char[] strChar=a.toCharArray();
        String result="";
        for(int i=0;i<strChar.length;i++){
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        
        System.out.println(result);
        
        
        
        String[] tempStr=StrToStrArray(result);
        char[] tempChar=new char[tempStr.length];
        for(int i=0;i<tempStr.length;i++) {
            tempChar[i]=BinstrToChar(tempStr[i]);
        }
        System.out.println(String.valueOf(tempChar));
	}
	
	//将初始二进制字符串转换成字符串数组，以空格相隔
    public static  String[] StrToStrArray(String str) {
        return str.split(" ");
    }
    
  //将二进制字符串转换为char
    private static char BinstrToChar(String binStr){
        int[] temp=BinstrToIntArray(binStr);
        int sum=0;   
        for(int i=0; i<temp.length;i++){
            sum +=temp[temp.length-1-i]<<i;
        }   
        return (char)sum;
    }
  //将二进制字符串转换成int数组
    private static int[] BinstrToIntArray(String binStr) {       
        char[] temp=binStr.toCharArray();
        int[] result=new int[temp.length];   
        for(int i=0;i<temp.length;i++) {
            result[i]=temp[i]-48;
        }
        return result;
    }
}

