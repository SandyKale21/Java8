package com.citi.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ReverStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "chetan manohar kale";
		String[] splitStr= str.split(" ");
        Collections.reverse(Arrays.asList(splitStr));
        for(String s:splitStr) {
        System.out.println(s);
        }
	}

}
