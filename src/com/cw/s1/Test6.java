package com.cw.s1;

import java.util.Scanner;

public class Test6 {
	public static void main(String [] args) {
		System.out.println("==== Test6 Start ====");
		//kor, eng, math 입력
		//총점, 평균 계산
		//평균이 60점 이상이면 합격, 아니면 불합격 출력
		
		Scanner sc = new Scanner(System.in);
	
		//kor 점수 입력
		System.out.println("국어 점수 입력");
		int kor=sc.nextInt();
		//eng 점수 입력
		System.out.println("영어 점수 입력");
		int eng=sc.nextInt();
		System.out.println("수학 점수 입력");
		int math=sc.nextInt();
		
		int total = kor+eng+math;
		double avg = total/3.0;
		String result="불합격";
		
		if(avg>=60) {
			result = "합격";
		}
		
		System.out.println(result);
/*		
		if (avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
*/		
/*		
		int num = 151;
		
		if (num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
*/		
		
		System.out.println("==== Test6 Finish ====");
	}

}
