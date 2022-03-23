package com.test.junit;

import java.util.ArrayList;
import java.util.HashSet;

import org.assertj.core.util.Arrays;

// 중복제거
public class ListCheckTest {

	public static void main(String[] args) {
		
		// List
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		arr.add("apple");
		arr.add("orange");
		arr.add("banana");
		arr.add("apple");
		
		for(int i=0; i<arr.size(); i++) {
			if(!arr2.contains(arr.get(i))) {
				arr2.add(arr.get(i));
			}
		}
		System.out.println("List :" + arr2);
		
		// HashSet
		HashSet<String> hashSet = new HashSet();
		for(String data : arr) {
			hashSet.add(data);
		}
		System.out.println("HashSet :" + hashSet);
		
		// List to Array
		String[] array = arr.toArray(new String[0]);
		for(String a : array) {
			System.out.println("List to Array :" + a);
		}
		
	}

}
