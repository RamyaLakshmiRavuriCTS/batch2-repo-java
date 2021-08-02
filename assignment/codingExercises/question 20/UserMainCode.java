package com.cts.qus20;

import java.util.Map;

public class UserMainCode {

	public static String getMaxKeyValue(Map<Integer, String> personMap) {
		String maxKeyValue = null;
		int max = 0;

		for (Map.Entry<Integer, String> person : personMap.entrySet()) {

			if (person.getKey() > max) {
				max = person.getKey();
				maxKeyValue = person.getValue();
			}
		}
		return maxKeyValue;
	}
}