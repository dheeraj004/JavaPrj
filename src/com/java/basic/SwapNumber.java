package com.java.basic;

public class SwapNumber {

	public static void main(String[] args) {
		
		/*
		 * int a=10,b=20; System.out.println("Value of A before swaping:"+a+
		 * "\n"+"Value of B before swaping:"+b);
		 * 
		 * a=a^b; b=a^b; a=a^b;
		 * 
		 * System.out.println("Value of A after swaping:"+a+
		 * "\n"+"Value of B after swaping:"+b);
		 */
		
		
		/*
		 * int a=10,b=20, temp; System.out.println("Value of A before swaping:"+a+"\n"+
		 * "Value of B before swaping:"+b);
		 * 
		 * temp=a; b=a; b=temp; System.out.println("Value of A after swaping:"+a+
		 * "\n"+"Value of B after swaping:"+b);
		 */
		
		
		int a=10,b=20;
		System.out.println("Value of A before swaping:"+a+"\n"+
		"Value of B before swaping:"+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("----------------------------");
		System.out.println("Value of A after swaping:"+a+
				 "\n"+"Value of B after swaping:"+b);
		
		
		
		
		
	}

}
