package com.cw.s2;

import java.util.Scanner;

public class ForTest8 {
	public static void main(String[] args) {
		System.out.println("==== ForTest8 Start ====");
		// 분, 초 출력
		//0분 0초
		//0분 1초
		//...
		//0분 59초
		//1분 0초
		//...
		//59분 59초
		//분, 초 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("분 입력");
		int m = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		boolean flag=false;
		for(int min=0;min<60;min++) {
			for(int sec=0;sec<60;sec++) {
				System.out.println(min+"분 "+sec+"초");
				if(m==min&&s==sec) {
					System.out.println("종료");
					flag=true;
					break;		
				}
			}
			if(flag) {
				break;
			}
			
		}
		
		
		
		System.out.println("==== ForTest8 Finish ====");
	}

}
