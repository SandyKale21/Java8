package com.citi.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppleTest {
	

	public static void main(String[] args) {
		
		String inputStr = "aabbcddd";
String[] vowels = {"a","e","i","o","u"}; 

        Predicate<Character> checkVowel =  x -> Arrays.asList(vowels).contains(x);

	String map = inputStr // original source or string
	        .chars() // get character stream
	        .mapToObj(x-> (char)Character.toLowerCase(x))		
		//	.filter(ch -> (
	      //         Arrays.asList(vowels).contains(ch))) 
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.map(e -> e.getKey().toString())
	//	.distinct()
		.collect(Collectors.joining());
	System.out.println(map);
		//.entrySet()
		//.stream()
		//.filter(e ->e.getValue()>1L)
		//.map(e -> e.getKey())
		//.findFirst()
		//.get();
		
		Stream.of(inputStr).forEach(x -> System.out.print(x));	
		
		long value =inputStr // original source or string
        .chars() // get character stream
        .map(x-> (char)Character.toLowerCase(x))		
		.filter(ch -> (
               Arrays.asList(vowels).contains(Character.toString(ch)))) 
		//.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
// filter out vowels
        .count(); // count vowels
	System.out.println(value);


	}
	
//	boolean TestVovel(Character c) {
	//	 boolean result = Arrays.asList(vowels).contains(c);
	//	 System.out.println(result);
		// return result;
	
	//}

}
