package com.cw.s2;

import java.util.Scanner;

public class ForTest6 {
	public static void main(String [] args) {
		System.out.println("==== ForTest6 Start ====");
		
		//회원가입시 입력한 ID
		int id=1234;
		//회원가입시 입력한 PW
		int pw=5678;
		boolean flag=false;
		
		Scanner sc = new Scanner(System.in);
		
		//최대 5번 기회
		//1. 최대 5번 로그인 시도
		for(int i=1;i<=5;i++) {
			if(i!=1) {
				System.out.println(i+"번째 로그인 시도");
			}
			System.out.println("ID 입력");
			int uId=sc.nextInt();
			System.out.println("PW 입력");
			int uPw=sc.nextInt();
			if(id==uId && pw==uPw) {
				flag = !flag;
				break;
			}
			System.out.println(i+"번째 로그인 실패");				
			
		}//for 끝
		//for 종료
		//flag 가 true면 로그인 성공, false면 모두 실패
		if(flag) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 은행에 방문");
		}

		
		
		
		
		System.out.println("==== ForTest6 Finish ====");
	}


}
