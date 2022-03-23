package com.test.junit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSortTest {

	public static void main(String[] args) {

		Integer[] intArr = { 3, 4, 5, 2, 111, 55, 4326, 22, 42, 11, 156, 784, 433, 9 };
		
		// Integer배열을 List로 변환
		List<Integer> intList = Arrays.asList(intArr);
		System.out.println("---------------- 숫자 오름차순 정렬 전 ------------------");
		for (int i : intList) {
			System.out.print(i + " ");
		}

		System.out.println();
		Collections.sort(intList);
		
		System.out.println("---------------- 숫자 오름차순 정렬 후 ------------------");
		for (int i : intList) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		String[] strArr = { "한글", "영어", "갤럭시", "경제", "유튜브", "삼성", "코딩노잼", "배열" };
		// String배열을 List로 변환
		List<String> strList = Arrays.asList(strArr);
		System.out.println("---------------- 문자 가나다 역순 정렬 전 ------------------");
		for (String s : strList) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 가나다의 역순으로 정렬
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println("---------------- 문자 가나다 역순 정렬 후 ------------------");
		for (String s : strList) {
			System.out.print(s + " ");
		}

	}

}
