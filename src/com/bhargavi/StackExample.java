package com.bhargavi;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s);
	}

}
