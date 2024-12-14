package com.bhargavi;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.removeElement(10);
		v.removeElementAt(0);
		System.out.println(v);
		
	}

}
