package com.practice.love2code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortingDemo {

	private static List<Entry<Integer, String>> sortMapByItsValues(Map<Integer, String> inputMap) {

		// Create List reference with given inputMap by using Interface - Entry
		List<Entry<Integer, String>> list = new ArrayList<>(inputMap.entrySet());

		// Just to shuffle the order of elements inside the list
		Collections.shuffle(list);

		System.out.println("Before sorting = " + list);
		list.sort(Entry.comparingByValue());
		System.out.println("After sorting = " + list);

		return list;
	}

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "C++");
		map.put(3, "Python");
		map.put(4, "Ruby");
		
		List<Entry<Integer, String>> sortedListByValues = sortMapByItsValues(map);

	}

}


/*
 * Output: 
 *
 * Before sorting = [1=Java, 4=Ruby, 2=C++, 3=Python]
 * After sorting = [2=C++, 1=Java, 3=Python, 4=Ruby]
 * 
*/
