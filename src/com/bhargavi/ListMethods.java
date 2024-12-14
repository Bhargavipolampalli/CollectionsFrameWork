package com.bhargavi;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List<String> l2=new ArrayList<String>();
		l2.add("Bhargavi");
		l2.add("Polampalli");
		l2.add("Uma");
		System.out.println(l2);
		List<Object> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(2,25);
		l.addAll(2,l2);
		System.out.println(l.get(2));
		System.out.println(l.set(1, "bhar"));
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf("Uma"));
		System.out.println(l);
	}

}
