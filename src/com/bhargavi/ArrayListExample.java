package com.bhargavi;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a);//[A, 10, A, null]
		a.remove(2);
		System.out.println(a);//[A, 10, null]
		a.add(2,"m");
		a.add("n");
		System.out.println(a);
	}

}
