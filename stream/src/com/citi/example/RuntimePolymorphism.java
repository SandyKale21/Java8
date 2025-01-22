package com.citi.example;

import java.io.IOException;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	protected int add() throws ArrayIndexOutOfBoundsException{
		return 1;
	}

}


 class Sub extends RuntimePolymorphism {

		
	 protected int add() throws Exception {   //visibility should be protected or public
		return 1;
	}

}
