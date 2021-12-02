package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		
		Point p04 = p02; //같은 주소값 
		
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());	
		System.out.println("========================");
		
		System.out.println("#hashCode()");//모 클래스가 있기 때문에 나옴 자클래스에는 없음 
		System.out.println(p00.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("========================");
			
		System.out.println("#toString()");//모 클래스가 있기 때문에 나옴 자클래스에는 없음 
		System.out.println(p00.toString()); //재정의 된것 
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("========================");
		
		System.out.println("#equals()");//모 클래스가 있기 때문에 나옴 자클래스에는 없음 
		System.out.println(p00.equals(p02)); //(2,3)(5,9) false
		System.out.println(p00.equals(p01)); //(2,3)(2,3) false 값을 의미하는 것이 아니다 / 클래스를 의미하는 것 
		System.out.println(p00==p01); //false 주소 값을 비교하는 것 
		System.out.println(p02==p04); //true 주소가 같은 메모리를 가지고 있는것 
		System.out.println("========================");
	}
}
