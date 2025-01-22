package com.citi.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8_practise {

	public static void main(String[] args) {
		
		Person p1 = new Person("1","A8o");
		Person p2 = new Person("5","A5");
		Person p3 = new Person("3","A30");
		Person p4 = new Person("3","A20");
		Person p5 = new Person("7","A8");

		Map<String,Person> hm = new HashMap<String,Person>();
		
		hm.put(p1.getName(), p1);
		hm.put(p2.getName(), p1);
		hm.put(p3.getName(), p1);
		hm.put(p4.getName(), p1);
		hm.put(p4.getName(), p5);
		
	
		
		System.out.println("KERRRRR "+hm.put(p1.getName(), p5));
		
		
		hm.entrySet().stream().sorted();
		
		hm.forEach((k,v)-> System.out.println(k +" "+v));
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		forEach(System.out::println);
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		forEach(System.out::println);
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Comparator<Person> ppom = (c1,c2)->{if(c1.getName().equals(c2.getName())) {
			return c1.getCompany().compareTo(c2.getCompany());
		}else{
			return c1.getName().compareTo(c2.getName());
		}};
		
		Collections.sort(list,ppom);
		System.out.print("ffrgrgrtyrty");

		System.out.print(list);
		
		List<Person> sortedList = list.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
		
		sortedList.forEach(p-> System.out.println(p.getName() +" "+p.getCompany()));
	
List<Person> sortedList1 = list.stream().sorted(Comparator.comparing(Person::getCompany)).collect(Collectors.toList());
		
		sortedList1.forEach(p-> System.out.println(p.getName() +" "+p.getCompany()));
	
		
List<Person> sortedList2 = list.stream().sorted(Comparator.comparing(Person::getName).thenComparing(Person::getCompany)).collect(Collectors.toList());
	System.out.println("ddddd");	
		sortedList2.forEach(p-> System.out.println(p.getName() +" "+p.getCompany()));

		Map<String,Person> listMap = list.stream().collect(Collectors.toMap(x -> x.getName(), x-> x));
		
		listMap.forEach((k,v)-> System.out.println(k +" "+v));
		
		
		String str = "chketan kale";
		
		Character c = str.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e ->e.getValue()>1L)
		.map(e -> e.getKey())
		.findFirst()
		.get();
		
		
		
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(11);
		numList.add(22);
		numList.add(18);
		
		numList.stream().mapToInt(x-> x.intValue()).filter(x->x/10==1).forEach(System.out::println);

	//	list.stream().collect(Collectors.groupingBy(null));
		
		
		System.out.println("character " +c);
		
		
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("A");
		listString.add("E");
		listString.add("B");
		listString.add("D");
		listString.add("H");
		Map map =listString.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
				
		map.forEach((k,v)-> System.out.println(k+" "+v));
		
	    Map hm1  = list.stream().collect(Collectors.toMap(x->x.getCompany(), x->x));
		
	//	listString.get(100);
		
		
		String revstr = "chetan kale";
		
		int len = revstr.length();
		
	//	IntStream.range(0, len).mapToObj(j->revstr.charAt((len-1-j))).Collectors.joining("");
		
		//Optional<String> kk =IntStream.range(0, listString.size()).asLongStream().filter(x -> listString.get((int)x).equals("A"))
		//		.findFirst();
		
		list.stream().collect(Collectors.groupingBy(
				Person::getName, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Person::getCompany)))
				));
	}
}

 class Person implements Comparable<Person>{
	private String name;
	private String company;
	
   public Person(String name, String company) {
	   this.name=name;
	   this.company= company;
   }
	
   public String getName() {
	   return this.name;
   }
   
   public String getCompany() 
   {
	   return this.company;
   }
   
   @Override
   public String toString() {
	   return this.getName() +" "+this.getCompany();
   }

@Override
public int compareTo(Person o) {
	return this.company.compareTo(o.company);
}
   }
