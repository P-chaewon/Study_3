package com.cw.s2;

public class ForTest4 {
	
	public static void main(String [] args) {
		System.out.println("==== ForTest4 Start ====");
		
		int hap=0; //누적함수
//		hap=hap+1; //1
//		hap=hap+2; //3
//		hap=hap+3; //6
//		hap=hap+4; //10
//		hap=hap+5; //15
		
//		for(int i=1;i<=100;i++) {
//			hap=hap+i;
//			if(i==100) {
//				System.out.println(hap);
//			}
//		}
		
		for(int i=1;i<=5;i++) {
			hap = hap +i;
		}
		System.out.println("총 합 : "+hap);
		
//		System.out.println("hap : "+hap);
		
		
		System.out.println("==== ForTest4 Finish ====");
	}

}
