package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(2, 2);
		Point p02 = new Point(1, 1);
		Point p03 = new Point(3, 3);

		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("유재석", p03);

		System.out.println(pMap.size());
		System.out.println(pMap.toString());

		// 정우성의 y값 불러오기
		System.out.println(pMap.get("정우성").getY());

		Point p04 = new Point(100, 100);
		pMap.put("박명수", p04);
		System.out.println(pMap.toString());

		// 키목록
		Set<String> keys = pMap.keySet();

		// 키 전체 출력
		for (String name : keys) {
			System.out.println(name);
		}

		// 전체 출력하기
		for (String name : keys) {
			System.out.println(pMap.get(name).toString());
			System.out.println(pMap.get(name).getX());
		}

	}

}
