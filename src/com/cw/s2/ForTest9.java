package com.cw.s2;

import java.util.Scanner;

public class ForTest9 {
	public static void main(String[] args) {
		System.out.println("==== Test9 Start ====");
		
		//FPS
		//탄창 3개
		//한 탄창에 총알 30발
		//단발모드 1발, 점사모드 3발
		//1. 단발? 2. 점사?
		//1-탕 30번
		//2- 타타탕 10번
		//3-
		
		Scanner sc=new Scanner(System.in);
		for(int mag=1;mag<=3;mag++) {
			System.out.println("단발(1) or 점사(2)");
			int type=sc.nextInt();
			String sound="탕";
			//int shot=30;
			int num=1;
			if (type!=1) {
				sound="타타탕";
			//	shot=10;
				num=3;
			}
			for(int i=0;i<30;i=i+num) {
				System.out.println(sound);
			}
		}

		
//		for(int mag=1;mag<=3;mag++) {
//			System.out.println("단발(1) or 점사(2)");
//			int type=sc.nextInt();
//			if(type==1) {
//				for(int shot=1;shot<=30;shot++) {
//					System.out.println("탕");
//				}
//			}else {
//				for(int shot=1;shot<=10;shot++) {
//					System.out.println("타타탕");
//				}
//			}
//		}
		System.out.println("==== Test9 Finish ====");
	}

}
