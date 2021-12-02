package com.javaex.ex03;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {

	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드 g,s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {//Object로 정의해놓음 java에서는 뭐가 올지 몰랐기 때문에 막에 놓은것임
		Point p = (Point)obj;//Object 다운캐스팅
		//x==x  && y==y 모든 객체의 x,y를 비교 a.x / b,x는 특정시킨것
		if(this.x==p.x && this.y==p.y) {
			return true;
		}else {
			return false;
		}

	}

}
