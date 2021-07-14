package com.cw.s2;

import java.util.Scanner;

public class ForTest5 {
	
	public static void main(String [] args) {
		System.out.println("==== ForTest5 Start ====");
		Scanner sc=new Scanner(System.in);
		//총 합을 담을 변수
		int total=0;
		//평균을 담을 변수
		double avg=0.0;
		//과목 수를 담을 변수
		int sub=0;		
		
		//과목 수 입력
		System.out.println("과목 수 입력");
		sub=sc.nextInt();
		for(int i=1;i<=sub;i++) {
			//과목수 만큼 점수 입력
			//30+50+70
			System.out.println(i+"번째 과목 점수 입력");
			int num=sc.nextInt();
			//총 합 계산 후 출력
			total=total+num;
		}
		//평균 계산 후 출력
		avg = total/(double)sub;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		
		System.out.println("==== ForTest5 Finish ====");
	}

}
