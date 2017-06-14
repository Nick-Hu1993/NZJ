package org.test;

import java.util.Date;
import java.util.Random;

import org.tool.readProperties;

public class test16 {

	public static void main(String[] args) {
		readProperties p = new readProperties(); 
		System.out.println(p.getP("server"));
	}

}
