/*
 * 测试结果：
 * da89643291a90f2910672594e3627ec6
 * da89643291a90f2910672594e3627ec6
 * */
package org.test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class test19 {
	 
    public static void main(String[] args) {
        test19 test = new test19();
        System.out.println(test.encryption("sql1234"));
    }
 
    /**
     *
     * @param plainText
     *            明文
     * @return 32位(小)密文
     */
    public String encryption(String plainText) {
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
 
            re_md5 = buf.toString();
 
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5;
    }
}

