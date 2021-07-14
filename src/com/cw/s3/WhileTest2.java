package com.cw.s3;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		System.out.println("WhileTest2 Start");
		
		int id=1234;
		int pw=5678;
		
		//1. 로그인
		// ID, PW 입력
		// 로그인 판단
		//2. 종료
		
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		while(flag) {
			System.out.println("1. 로그인  2. 종료");
			int num=sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("ID 입력");
				int yId=sc.nextInt();
				System.out.println("PW 입력");
				int yPw=sc.nextInt();
				if(id==yId&&pw==yPw) {
					flag=!flag;
				}
				break;
			default:
				flag=!flag;
				
			}
		}
		
		
		
		System.out.println("WhileTest2 Finish");
	}

}
