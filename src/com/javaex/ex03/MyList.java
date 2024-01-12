package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {

	private T[] objArray; // object를 부모로 갖고있는것을 다 쓸수있음.
	private int crtPos;

	public MyList() {
		objArray = (T[]) new Object[3];
		crtPos = 0;
	}

	public void add(T o) {
		// 현재배열개수+1 배열을 새로 만든다
		// 이전배열의 값을 새배열에 옮긴다
		// 마지막방에 새주소를 추가한다
		objArray[crtPos] = o;
		crtPos += 1;
	}

	public int size() {

		return crtPos;
	}

	public T get(int index) {

		return objArray[index];
	}

	@Override
	public String toString() {
		return "MyList [objArray=" + Arrays.toString(objArray) + ", crtPos=" + crtPos + "]";
	}

}
