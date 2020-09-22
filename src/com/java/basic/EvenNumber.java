package com.java.basic;

public class EvenNumber {

	public static void main(String[] args) {

		/*
		 * for(int i=0;i<=100;i=i+2) { System.out.println(i); }
		 */
		
		/*
		 * for(int i=0;i<=100;i++) {
		 * 
		 * if(i%2==0) { System.out.println("Even Number:"+i); }
		 * 
		 * 
		 * }
		 */
		
		// By using While Loop
		int i = 0;
		/*
		 * while(i<=100) {
		 * 
		 * if(i%2==0) 
		 * { 
		 * System.out.println("Even number:"+i);
		 *  }
		 * 
		 * i++; }
		 */
		

		do 
		{
			if(i%2==0) 
			{
				  System.out.println("Even number:"+i);
			}
			i++;
		}
		
		while(i<=100);
	}

}
