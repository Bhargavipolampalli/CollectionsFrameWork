package com.bhargavi;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {
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
		l.addAll(l2);
		l.remove(0);
		l.removeAll(l2);
		l.retainAll(l2);
		System.out.println(l.contains(20));
		System.out.println(l.containsAll(l2));
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.toArray());
		System.out.println(l);
		
		
	}

}
