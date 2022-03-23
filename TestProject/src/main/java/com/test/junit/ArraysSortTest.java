package com.test.junit;

import java.util.Arrays;
import java.util.Collections;

// 정렬
public class ArraysSortTest {

	public static void main(String[] args) {

		// int
		int[] intArr = { 1, 5, 9, 11, 2, 3, 6, 2, 3, 4, 2 };
		System.out.println("------ int 정렬전 ------ ");
		for (int i : intArr) {
			System.out.println("정렬전 : " + i);
		}

		System.out.println("------ int 정렬후 ------ ");
		Arrays.sort(intArr);
		for (int i : intArr) {
			System.out.println("정렬후 : " + i);
		}

		// String
		String[] strArr = { "한글", "코딩", "자바", "배열", "정렬", "가족" };
		System.out.println("------ String 정렬전 ------ ");
		for (String i : strArr) {
			System.out.println("정렬전 : " + i);
		}

		System.out.println("------ String 정렬후 ------ ");
		Arrays.sort(strArr);
		for (String i : strArr) {
			System.out.println("정렬후 : " + i);
		}
		
		System.out.println("------ String 역순 정렬후 ------ ");
		Arrays.sort(strArr, Collections.reverseOrder());
		for (String i : strArr) {
			System.out.println("정렬후 : " + i);
		}
	}

}
