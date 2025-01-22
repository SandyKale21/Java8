package com.citi.example;

public class TestObject{

public static void main(String args[]) throws CloneNotSupportedException {
 
RestrictObjectCreation obj1= RestrictObjectCreation.getInstance();
RestrictObjectCreation obj2= RestrictObjectCreation.getInstance();
RestrictObjectCreation obj3= RestrictObjectCreation.getInstance();
RestrictObjectCreation obj4= RestrictObjectCreation.getInstance();
RestrictObjectCreation obj5= RestrictObjectCreation.getInstance();
RestrictObjectCreation obj6 = (RestrictObjectCreation) obj5.clone();
System.out.println(obj1.hashCode());
System.out.println(obj2.hashCode());
System.out.println(obj3.hashCode());
System.out.println(obj4.hashCode());
System.out.println(obj5.hashCode());
System.out.println(obj6.hashCode());
 
}
}
