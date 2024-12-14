package com.bhargavi;

import java.util.ArrayList;

public class ArrayListFind {
	public static void main(String[] args) {
			ArrayList<Integer> list=new ArrayList<>();
			list.add(10);
			list.add(20);
			list.add(5);
			list.add(30);
			list.add(15);
			Integer found=null;
			for(int num:list) {
				if(num>15) {
					found=num;
					break;
				}
			}
			System.out.println("First elemen greater than 15:"+found);
	}

}
