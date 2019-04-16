package com.vo;

import java.util.ArrayList;
import java.util.Collections;

public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		
		names.add("santhu");
		names.add("chandra");
		names.add("ajith");
		names.add("vt");
		names.add("preethi");
		names.add("ram");
		
		Collections.sort(names);
		
	
		
		for(String str: names) {
			System.out.println(str);
		}
				
				
	}

}
