package com.cw.s1;

import java.util.Scanner;

public class Test8 {
	
	public static void main(String [] args) {
		System.out.println("==== Test8 Start ====");
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

// 1차 코드
//		if(avg>=60) {
//			if(kor>=40) {
//				if(eng>=40) {
//					if(math>=40) {
//						System.out.println("합격");
//					}else {
//						System.out.println("수학 과락 불합격");
//					}
//				}else {
//					System.out.println("영어 과락 불합격");
//				}
//			}else {
//				System.out.println("국어 과락 불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}

// 2차코드
//		if(avg>=60) {
//			if(kor>=40 && eng>=40 && math>=40) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("불합격");
//		}
		

				
		if(avg>=60 && kor>=40 && eng>=40 && math>=40) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		
		//합격 기준
		//평균이 60점 이상
		//과목당 40점 이상
		System.out.println("==== Test8 Finish ====");
	}

}
