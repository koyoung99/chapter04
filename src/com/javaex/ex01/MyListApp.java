package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		/*
		 * Point[] pArray = new Point[3]; //갯수를 확정해야한다 Point p1 = new Point(2,2); Point
		 * p2 = new Point(12,13); Point p3 = new Point(22, 23);
		 * 
		 * pArray[0] = p1; pArray[1] = p2; pArray[2] = p3;
		 * 
		 * for(int i=0; i<pArray.length; i++) {
		 * System.out.println(pArray[i].toString()); }
		 */
		// 포인트 관리
		PointList pList = new PointList();

		Point p1 = new Point(2, 2);
		Point p2 = new Point(12, 13);
		Point p3 = new Point(22, 23);

		pList.add(p1);
		pList.add(p2);
		pList.add(p3);

		int count = pList.size();
		System.out.println(count);

		Point p = pList.get(0);
		System.out.println(p.getX());

		System.out.println(pList.toString());

		// 원관리
		CircleList cList = new CircleList();
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);

		cList.add(c01);
		cList.add(c02);

		System.out.println(cList.toString());

		// 도형이 생기면 계속 만들어야함 .
		// Circle, Point 클래스로 한정짓지않고 Object를 부모로>> 해결방안 com.javaex.ex02
	}

}