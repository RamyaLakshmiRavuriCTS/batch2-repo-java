package com.cts.hashmap;

import java.util.Map;

public class UserMainCode {

	public static int getAverageOfOdd(Map<Integer, Integer> map) {
		
		int sum = 0;
		int count = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getKey() % 2 != 0) {
				sum += entry.getValue();
				count++;
			}
		}
		
		if (count != 0) {
			return (sum / count);
		}
		
		return -1;
	}

}
