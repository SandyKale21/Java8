package com.test;

import java.util.Optional;

public class OptionalTest {
	
	static Optional<OptionalTest> get() {
		//return Optional.of(new OptionalTest());
		//return Optional.of(null);
		return Optional.ofNullable(null);


	}
	
	public int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {

		try {
			get().orElseThrow(Exception::new);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
		
		String abc = null;
		String result = Optional.ofNullable(abc).map(x->x.toLowerCase()).orElse("error");
	    System.out.println(result);

	    Optional<String> opt = Optional.of("Baeldung");
	    System.out.println(opt.isPresent());

	    opt = Optional.ofNullable(null);
	    System.out.println(opt.isPresent());

	}

}
