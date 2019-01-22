package com.spring.au;
//Class to show the functionality of factory method
public class Factory {  
	
private static final Factory obj=new Factory();  

private Factory()
{
	System.out.println("from private constructor");
	
}  

//This method will be called by the factory method
public static Factory getA()
{  
    System.out.println("Now factory method is called");  
    return obj;  
}
}  
