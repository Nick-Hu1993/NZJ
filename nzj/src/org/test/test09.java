package org.test;



public class test09 {
	public static void main(String[] args) {
		int m=16;
		int n=6;
		int[] a = new int[m];
		
		a=makeA(a, m-1, n);
		
		
//		for(int i=0;i<m;i++){
//			a[i]=n;
//		}
		
		for(int k:a){
			System.out.println(k);
		}
	}
	
//	public static int make(int k){
//		if(k==1){
//			return k*1;
//		}else{
//			return k*make(k-1);
//		}
//	}
	
	public static int[] makeA(int[] a,int m,int n){
		if(m==0){
			a[m]=n;
			return a;
		}else{
			a[m]=n;
			return makeA(a,m-1, n);
		}
	}
}