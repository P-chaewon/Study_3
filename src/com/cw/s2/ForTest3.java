package com.cw.s2;

import java.util.Scanner;

public class ForTest3 {
	
	public static void main(String [] args) {
		System.out.println("==== ForTest3 Start ====");
		
		//종료 시간을 입력 받기
		//12s
		//0s~12s 끝
		//단, 60이라는 상수는 변경 불가능
		
		Scanner sc=new Scanner(System.in);
		System.out.println("종료시간 입력");
		int num=sc.nextInt();
		for(int sec=0;sec<60;sec++) {
			if(sec<=num) {
				System.out.println(sec+"초");
			}
		}
		
		for(int sec=0;sec<60;sec++) {
			System.out.println(sec+"초");
			if(sec==num) {
//				sec=60;
				break;
			}
		}
		
//		for(int sec=0;sec<60;sec++) {
//			if(sec<=12) {
//				System.out.println(sec+"초");
//			}
//		}
		
		
		
		System.out.println("==== ForTest3 Start ====");
	}

}
