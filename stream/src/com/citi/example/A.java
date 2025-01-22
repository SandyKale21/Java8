package com.citi.example;

@FunctionalInterface
public interface A {
public void m1();

//@Override
public boolean equals(Object o);

//public boolean equals1(Object o);
}

@FunctionalInterface
interface H extends A{
	public void m3();
}
