package com.bhargavi;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(30);
		list.add(15);
		Collections.reverse(list);
		System.out.println("Reversed list:"+list);
	}

}
