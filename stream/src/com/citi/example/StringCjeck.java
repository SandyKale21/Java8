package com.citi.example;

public class StringCjeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="chetan";
		String s2 ="chetan";
		String s4=s1;
        String s3 = new String("chetan");

		
		System.out.println("111" +(s1==s2));  //true

		System.out.println("222" +(s4==s1));   //true
		
		System.out.println("3333" +(s1.equals(s2)));  //true
		
		System.out.println("3333" +(s3.equals(s2)));  //true

		System.out.println("3333" +(s3==s1));  //true


		//System.out.println("111" +(s1==s2));  //false

		//System.out.println("111" +(s1==s2));  //false
		
        String str = null;
        System.out.println(str.valueOf(10));

        System.out.println(str);
        
        String s6 = null;
        System.out.println(s6); //line 2
      //  System.out.println(s6.toString()); //line 3
    

        String s7 = "hello";
        String s8 = new String("hello");

        s8 = s8.intern();
        System.out.println(s7 == s8);
        
        
        
        String s10 = "abc";
        StringBuffer s20 = new StringBuffer(s10);
        StringBuffer s30 = new StringBuffer("abc");

        System.out.println(s10.equals(s20.toString()));
        System.out.println(s10 == (s20.toString()));

        System.out.println(s20.equals(s30));
        System.out.println(s20 == s30);

  
	}

}
