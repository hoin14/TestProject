package com.test.junit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// 해쉬맵
public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<String, String>();
		HashMap<String, String> map2 = new HashMap<>();
		HashMap<String, String> map3 = new HashMap<>(map1);
		HashMap<String, String> map4 = new HashMap<>(10);
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f);
		HashMap<String, String> map6 = new HashMap<String, String>();

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "사과");
		map.put(2, "바나나");
		map.put(3, "포도");

		// System.out.println(map.get(1));

		// map.remove(1);
		// map.clear();
		
		long start = System.nanoTime();
		// EntrySet()
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("EntrySet_" + "[Key]" + entry.getKey() + "[Value]" + entry.getValue());
		}
		long end = System.nanoTime();
		System.out.println("EntrySet : " + (end - start)/1000.0);
		
		long start1 = System.nanoTime();
		// KeySet()
		for (Integer i : map.keySet()) {
			System.out.println("KeySet_" + "[Key]" + i + "[Value]" + map.get(i));
		}
		long end1 = System.nanoTime();
		System.out.println("KeySet : " + (end1 - start1)/1000.0);
		
		
		// EntrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		long start2 = System.nanoTime();
		while (entries.hasNext()) {
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println("EntrySet().iterator()_" + "[Key]" + entry.getKey() + "[Value]" + entry.getValue());
		}
		long end2 = System.nanoTime();
		System.out.println("EntrySet().iterator() : " + (end2 - start2)/1000.0);
		
		// KeySet().iterator()
		Iterator<Integer> keys = map.keySet().iterator();
		long start3 = System.nanoTime();
		while (keys.hasNext()) {
			int key = keys.next();
			System.out.println("KeySet().iterator()_" + "[Key]" + key + "[Value]" + map.get(key));
		}
		long end3 = System.nanoTime();
		System.out.println("KeySet().iterator() : " + (end3 - start3)/1000.0);
		
	}

}
