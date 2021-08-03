package com.cts.question22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserMainCode {

	public static List<String> getName(Map<Integer, String> personMap) {
		List<String> names = new ArrayList<>();

		for (Map.Entry<Integer, String> person : personMap.entrySet()) {

			if (person.getValue().charAt(0) >= 'a' && person.getValue().charAt(0) <= 'z') {

				if (person.getValue().charAt(person.getValue().length() - 1) >= 'A'
						&& person.getValue().charAt(person.getValue().length() - 1) <= 'Z') {

					if (person.getValue().matches("^(?=.*[0-9])"))
						names.add(person.getValue());
				}

			}
		}
		return names;
	}
}
