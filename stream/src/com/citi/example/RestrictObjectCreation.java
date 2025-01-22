package com.citi.example;

public class RestrictObjectCreation implements Cloneable{

private static RestrictObjectCreation object= null;
public static int objCount = 0;
 
private RestrictObjectCreation()
{
     System.out.println("Singleton(): Private constructor invoked");
 
objCount  ++;
}
 
public static RestrictObjectCreation getInstance()
{
 
if (objCount < 3)
{
 
object = new RestrictObjectCreation();
 
 }
 
return object;
 
}

@Override
protected Object clone() throws CloneNotSupportedException  {
	//return super.clone();
	throw new CloneNotSupportedException();
}

protected Object readResolve() { 
return object;
}
 
}


