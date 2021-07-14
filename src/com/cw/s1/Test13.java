package com.cw.s1;

import java.util.Scanner;

public class Test13 {
	
	public static void main(String [] args) {
		System.out.println("==== Test13 Start ====");
		
		//요금조회 1번
		//상품가입 2번
		//고장신고 3번
		//상담원연결 0번
		//잘못 누르셨습니다. 다시 눌러주세요
		
		int num = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요금조회 1번");
		System.out.println("상품가입 2번");
		System.out.println("고장신고 3번");
		System.out.println("상담원연결 0번");
		
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("요금조회");
			break;
		case 2:
			System.out.println("상품가입");
			break;
		case 3:
			System.out.println("고장신고");
			break;
		case 0:
			System.out.println("상담원연결");
			break;
		default:
			System.out.println("잘못 누르셨습니다. 다시 눌러주세요");
			break;
		}
		
		
		System.out.println("==== Test13 Finish ====");
		
	}

}
