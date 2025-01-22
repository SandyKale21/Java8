package com.citi.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list  = new ArrayList<Integer>();
		
		list.add(1);
		list.add(1);

		list.add(4);

		list.add(4);
		list.add(2);

		List<Integer> distictList = list.stream().distinct().collect(Collectors.toList());

		System.out.print(distictList);
	}

}
