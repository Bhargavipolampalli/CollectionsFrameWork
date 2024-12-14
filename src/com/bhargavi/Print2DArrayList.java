package com.bhargavi;

import java.util.ArrayList;
import java.util.Collections;

public class Print2DArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> row1=new ArrayList<>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		
		ArrayList<Integer> row2=new ArrayList<>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		
		ArrayList<Integer> row3=new ArrayList<>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		System.out.println("Using for-each loop:");
		for(ArrayList<Integer> row:list) {
			System.out.println(row);
		}
		System.out.println("\nUsing collections:");
		for(ArrayList<Integer> row:list) {
			System.out.println(Collections.singletonList(row));
		}
	}

}
