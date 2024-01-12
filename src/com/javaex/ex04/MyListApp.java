package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();

		// add(), size(), get()
		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);
		Point p03 = new Point(6, 6);

		pList.add(p01); // 주소를 옮김.
		pList.add(p02);
		pList.add(p03);
		pList.add(p01); // 주소를 옮김.

		// 리스트크기
		System.out.println("size: " + pList.size());

		// 변수로 p01의 y값 불러오기
		System.out.println(p01.getY()); //

		// 리스트 통해서 p01의 y값 불러오기
//		Point val01 = pList.get(0);
//		val01.getY();
		System.out.println(pList.get(0).getY());

		// 전체 출력
		System.out.println("===========전체출력==================");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		// remove()
		pList.remove(0);
		System.out.println("==pList(0)리스트제거하고 전체출력======");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		// remove 주소로 지우기
		System.out.println("======pList(주소)로 지움========");
		pList.remove(p02);
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////

		List<Integer> iList = new ArrayList<Integer>();

//		Integer i01=new Integer(3);
		Integer i01 = 3; // 자동박싱

//		Integer i02=new Integer(6);
		Integer i02 = 6; // 자동박싱

		iList.add(i01);
		iList.add(i02);

		System.out.println(iList.toString());
	}

}
