package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";
		
		System.out.println(a.toUpperCase()); // 대문자로 변경
		 
		System.out.println(a.concat(b));// a와 b를 더하라
		System.out.println(b.concat(a));// b와 a를 더하라
		
		a = a.concat(b); //a+b 를 한 문자열로
		System.out.println(a); 
		
		a = a.trim(); //앞 뒤 공백제거(중간은 안됨)
		System.out.println(a);
		
		a = a.replace("ab", "34"); //ab를 장서윤으로 바꿔라
		System.out.println(a);
		
		String[] sArray = a.split(","); //,를 기준으로 잘라라 (배열로 만들어야함)
		for(int i = 0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		String str = "Hello JAVA!";
		String r01 = str.substring(3);//방번호 3번부터 출력하라 
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3, 8); //3부터 8번전까지 출력 
		System.out.println(r03);
		
		
	}

}
