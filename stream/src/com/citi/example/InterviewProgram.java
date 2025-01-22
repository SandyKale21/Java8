package com.citi.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(10,"chetan","Math");
		Student s2 = new Student(40,"chetan","Math");
		Student s3 = new Student(20,"chetan","M2");
		Student s4 = new Student(80,"chetan","M3");
		Student s5 = new Student(50,"chetan","M2");
		
        List<Student> list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        Comparator<Student>  s = (c1,c2)->c1.getRollNo() -c2.getRollNo();
        
        
        Comparator<Student> stud11 = (c1,c2)-> c1.getRollNo()-c2.getRollNo();
        list.stream().sorted(stud11).collect(Collectors.toList()).forEach(x->System.out.println(x));;
        
        list.stream().map(x->new Student(x.getRollNo(),x.getName()+"aaa",x.getDept())).forEach(x->System.out.println(x));;
        
        
        
        Spliterator<Student> splitr = list.spliterator();

        splitr.forEachRemaining((e)->System.out.println(e));
        
        Spliterator<Student> splitr1= splitr.trySplit();
    //    splitr1.forEachRemaining((e)->System.out.println(e));

       
     //   		updatedList.forEach(x->System.out.print(x));
        		Comparator<Student> c = (e1,e2)->  e1.getRollNo() - e2.getRollNo();
        BinaryOperator<Student> bo= BinaryOperator.maxBy(c);
       //  System.out.println( bo.apply(s4, s5));
        
        Collections.sort(list,c);
        
        Map<Integer,String> hm = new HashMap();
        hm.put(10,"Z");
        hm.put(40,"V");
        hm.put(20,"A");
        hm.put(80,"C");
        hm.put(50,"K");
        
        

      //  list.forEach(x->System.out.println(x));
        
        hm.entrySet().stream().sorted();
        
       // hm.forEach((k,v)->System.out.println("k " +k +"v " +v));
        
        hm.entrySet().stream();
        
        List<List<Integer>> integers = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
     //   integers.forEach(x->System.out.println(x));

        List<Integer> list1 = integers.stream().flatMap(x->x.stream()).collect(Collectors.toList());
      //  list1.forEach(x->System.out.println(x));

        
    //    list.stream().flatMap(x->x.)

        Stream.iterate(new int[] { 0, 1 }, p -> new int[] { p[1], p[0] + p[1] })
        .limit(10)
        .forEach(p -> System.out.println(p[0]));
        
      long resukty=  Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] })
        .limit(10)
        .skip(6)
        .findFirst()
        .get()[0];
      
      list.stream().limit(2).forEach(System.out::println);
      list.stream().skip(2).forEach(System.out::println);

      System.out.println("the result is "+resukty);
 	}

}

class Student{
	private int rollNo;
	private String name;
	private String dept;
	
	public Student(int rollNo, String name,String dept) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getDept(){
		return dept;
	}
	
}