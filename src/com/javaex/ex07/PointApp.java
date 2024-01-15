package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		// set에 Point관리
		Set<Point> pSet = new HashSet<Point>();

		Point p1 = new Point(1, 1);
		Point p2 = new Point(3, 6);
		Point p3 = new Point(5, 10);

		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);

//		System.out.println(pSet.toString());

		Point p4 = new Point(3, 6);

		pSet.add(p4);
//		System.out.println(pSet.toString());

		for (Point p : pSet) {
			System.out.println(p.hashCode());
		}

	}

}
