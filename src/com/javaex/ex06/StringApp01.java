package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {
		
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); //false 주소값이 같은가?
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println("============================");
		
		String str03 = "hello";
		String str04 = "hello";
		
		System.out.println(str03 == str04); //true 주소만 복사
		
		str04 = "hello!!!"; //str04 변경 > 새로운 문자열 생성
		
		System.out.println(str03 == str04); //false str04를 새로 생성했기 때문에 다른 주소 
		System.out.println(str03.hashCode()); //hashCode 재정의
		System.out.println(str04.hashCode()); 
		System.out.println(str03.toString()); //toString 재정의
	
	
	
	}

}
