package com.bhargavi;

import java.util.ArrayList;

public class MinAndMax{
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(30);
		list.add(15);
		int min=list.get(0);
		int max=list.get(0);
		for(int num:list) {
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
		}
		System.out.println("Minimum Value:"+min);
		System.out.println("Maximum Value:"+max);
		
	}

}
