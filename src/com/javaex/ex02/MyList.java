package com.javaex.ex02;

import java.util.Arrays;

public class MyList {
	// Object 리스트(따로관리) 틀은 겸용으로 만듬. 메모리에 올라가는 순간 자료형고정할수없음.

	private Object[] objArray; // object를 부모로 갖고있는것을 다 쓸수있음.
	private int crtPos;

	public MyList() {
		objArray = new Object[3];
		crtPos = 0;
	}

	public void add(Object o) {
		// 현재배열개수+1 배열을 새로 만든다
		// 이전배열의 값을 새배열에 옮긴다
		// 마지막방에 새주소를 추가한다
		objArray[crtPos] = o;
		crtPos += 1;
	}

	public int size() {

		return crtPos;
	}

	public Object get(int index) {

		return objArray[index];
	}

	@Override
	public String toString() {
		return "MyList [objArray=" + Arrays.toString(objArray) + ", crtPos=" + crtPos + "]";
	}

}
