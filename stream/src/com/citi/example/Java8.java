package com.citi.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		System.out.println("add " + ++i);
		System.out.println("add " + i++);
		System.out.println("add " + i);

		
		 Map<Integer,String> hm = new HashMap();
	        hm.put(10,"Z");
	        hm.put(40,"V");
	        hm.put(20,"A");
	        hm.put(80,"C");
	        hm.put(50,"K");
	       
	        Comparator<Map.Entry<Integer, String>> cValue = (c1,c2)-> { return c1.getValue().compareTo(c2.getValue());};
	        Comparator<Map.Entry<Integer, String>> cKey = (c1,c2)-> { return  -(c1.getKey()-c2.getKey());};

	        Map<Integer,String> resultMap=   hm.entrySet().stream()
	        		.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
	        		.collect(Collectors.toMap(e->e.getKey(), e->e.getValue(),(e1,e2)->e2,LinkedHashMap::new));

	        resultMap.forEach((k,v)->System.out.println(k +" "+v));
	        
	        Map<Integer,String> resultMap1=   hm.entrySet().stream().sorted(cKey).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));

	        resultMap1.forEach((k,v)->System.out.println(k +" "+v));

	        Comparator<Map.Entry<Integer,String>> cKey1 = (c1,c2)->{return c1.getKey()-c2.getKey();};
	        hm.entrySet().stream().sorted(cKey1).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
	        
	        
	        
	}

} 
