package com.cw.s1;

public class Test9 {
	
	public static void main(String [] args) {
		System.out.println("==== Test9 Start ====");
		
		boolean check = true;
		
		check = !check;
		
		if(!check) {
			System.out.println("TEST");
		}
		System.out.println(check);
		
		int age = 19;
		
		//조건식?조건식 true일 때:조건식 false일 때
		String result = age>=20?"성년":"미성년";
		
		System.out.println(result);
		System.out.println((3+2)*4);
		
		
		System.out.println(1+'1'+"1");
		System.out.println("==== Test9 Finish ====");
	}

}
