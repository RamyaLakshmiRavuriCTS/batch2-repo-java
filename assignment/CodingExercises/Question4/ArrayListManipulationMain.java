package com.cts;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListManipulationMain {

	public static void main(String[] args) {
		
		UserMainCode u = new UserMainCode();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter the no.of elements");
		int N=sc.nextInt();
		List<Integer> l1= new ArrayList<Integer>();
		List<Integer> l2= new ArrayList<Integer>();
		
		for (int i=0;i<N;i++) {
			l1.add(sc.nextInt());
		}
		
		for (int i=0;i<N;i++) {
			l2.add(sc.nextInt());
		}
		
		System.out.println(u.generateOddEvenList(l1, l2));
		

	}

}
