package com.cts.ArrayListAndSetOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserMainCode {

	public static List<Integer> performSetOperations(List<Integer> list1, List<Integer> list2, String operatorType) {
		List<Integer> resultList = new ArrayList<Integer>();
		
		switch (operatorType) {
		case "+":
			
			Set<Integer> setList = new HashSet<>();// for eliminating duplicates
			setList.addAll(list1);
			setList.addAll(list2);
			resultList.addAll(setList);
			break;

		case "*":
			
			for (Integer i : list1) {
				if (list2.contains(i)) {
					resultList.add(i);
				}
			}
			break;

		case "-":
			
			for (Integer i : list1) {
				if (!list2.contains(i)) {
					resultList.add(i);
				}
			}
			break;
		}

		return resultList;

	}
}
