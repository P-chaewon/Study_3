package com.cw.s3;

import java.util.Scanner;

public class WhileTest1 {
	public static void main(String[] args) {
		System.out.println("==== WhileTest1 Start ====");
		//0~4까지 출력
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		//while
		//while(조건식){}
		Scanner sc=new Scanner(System.in);
		
		boolean check=true;
		while(check) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("회원가입 코드 진행");
				break;
			case 2:
				System.out.println("로그인 코드 진행");
				break;
			default:
				check=!check;			
			}
			
			
//			if(select==1) {
//				System.out.println("회원가입 코드 진행");
//			}else if(select==2) {
//				System.out.println("로그인 코드 진행");
//			}else {
//				check=!check;
//				//check=false;
//				//break;
//			}
		}
		
		
		System.out.println("==== WhileTest1 Finish ====");
	}

}
