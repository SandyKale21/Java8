package com.citi.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaSampleExample {

	public static void main(String[] args) {

		String str = "natehc";
		String str1 = "chetan";

		HashMap hm = new HashMap();
		Map<Character, Long>  listMap =str.chars().mapToObj(x->Character.toLowerCase(Character.valueOf((char)x)))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(listMap);
		Map<Character, Long>  listMap1 =str1.chars().mapToObj(x->Character.toLowerCase(Character.valueOf((char)x)))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	
		System.out.println(listMap.equals(listMap1));
		System.out.println(listMap1);
		
		
		
		
	
		if(listMap.size()==listMap1.size()) {
		
		boolean flag =listMap.entrySet().stream().allMatch(x->x.getValue().equals(listMap1.get(x.getKey())));

		System.out.println("is analgram "+flag);
		}
		Optional<Character> list =str.chars().mapToObj(x->Character.toLowerCase(Character.valueOf((char)x)))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(x->x.getValue()<=1)
				.map(x->x.getKey())
				.findFirst();
				
				if(list.isPresent()) {
					System.out.println(list.get());
				}
				
				
				
		System.out.println(Optional.ofNullable(null)); //return Optional.empty
		//System.out.println(Optional.of(null));//NPE

	//	list.forEach(x-> System.out.println(x));
		
		
		ArrayList<String> listString = new ArrayList<String>();
		listString.add("A");
		listString.add("E");
		listString.add("B");
		listString.add("D");
		listString.add("H");
	
		String strNew =listString.stream().collect(Collectors.joining(","));
		System.out.println(strNew);
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       int sum =integers.stream().mapToInt(x->Integer.valueOf(x)).sum();
         OptionalDouble avg =integers.stream().mapToInt(Integer::intValue).average();
         OptionalInt max =integers.stream().mapToInt(Integer::intValue).max();

         if(avg.isPresent()) {
             System.out.println(avg.getAsDouble());

         } 
         
         
         List<String> words = Arrays.asList("GFG", "Geeks", "for",
                 "GeeksQuiz", "GeeksforGeeks");
         
      String resultStr=   words.stream().reduce("rerere",(w1,w2)-> 
         {if(w1.length()>w2.length()) {
        	 System.out.println("w1 " +w1);
        	 System.out.println("w2 " +w2);
        	 return w1;
         }else {
        	 System.out.println("w1 " +w1);
        	 System.out.println("w2 " +w2);
        	 return w2;
        	 
         }
        		 });
         
         System.out.println("the result is " +resultStr);
         //ifw1.length()>w2.length()).stream()
    		//   .peek(x->System.out.println(x));
       int result =  integers.stream().reduce(10,(w1,w2)->{ w1 = w1 + w2;
    		   return w1;});

       System.out.println(result);
   

   	}

}
