package com.cts;
import java.util.ArrayList;

import java.util.List;

public class UserMainCode {
	
	public static List<Integer> generateOddEvenList(List<Integer> l1,List<Integer>l2){
		
		List<Integer> finalList =new ArrayList<Integer>();
				
		for (int i=0; i<l1.size();i++) {
			if(i%2!=0)
				finalList.add(l1.get(i));
			finalList.add(l2.get(i));
		}		
		
		return finalList;
	}
}

