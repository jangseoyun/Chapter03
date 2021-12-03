package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		int n = 10;
		Integer i = new Integer(10);
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		System.out.println(n);//기본 자료형 (데이터값 바로 줌, 직접 접근가능)
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		int num01 = 10;
		int num02 = 7;
		int sum = num01+num02; // 01값+02값
		System.out.println(sum);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01 + i02; // 주소+주소
		System.out.println(result);
		
		
		Integer i03 = 99; // 주소가 들어가야하는데 값을 바로 넣은 것 (new 생략된것 , 예외상황)
						  //Integer i03 = new Integer(99);
		
		Integer i04 = new Integer(100);//박싱 : 메소드들을 사용할 수 있음 
		int num99 = i04; //언박싱 : 박스를 뜯어서 숫자만 꺼내서 넣은것
		
		System.out.println("===========================");
		
		//문자열 숫자("안녕하세요"는 불가) --> int 변경
		/*
		Integer i05 = 10; //박싱
		int r01 = i05.parseInt("12345"); //"12345"-->12345로 변경
		System.out.println(r01);
		*/
		
		//parseInt static임
		int r01 = Integer.parseInt("12345");
		System.out.println(r01);
		
		System.out.println("===========================");
		
		//int-->문자열로 변경
		/*
		String a = "안녕하세요";
		String snum = a.valueOf(555);
		System.out.println(snum);
		*/
		
		//case01
		String snum = String.valueOf(555);
		System.out.println(snum);
		
		//case02
		String r100 = ""+555; // 쉽게 문자열로 바꿈 
		System.out.println(r100);
		
	}

}
