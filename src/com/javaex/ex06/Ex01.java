package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		// hashset()을 이용한 로또번호 중복체크

		Set<Integer> iSet = new HashSet<Integer>();

		while (true) {
			if (iSet.size() >= 6) {
				break;
			}

			int no = (int) (Math.random() * 45) + 1;
			iSet.add(no);
		}

		for (Integer num : iSet) {
			System.out.print(num.toString() + "\t");
		}
	}
}
