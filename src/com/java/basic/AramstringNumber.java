package com.java.basic;

import java.util.Scanner;

public class AramstringNumber {
	
	static int temp;
	static int r=0;
	static int s=0;
	static int num;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		

		System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		temp=num;
		System.out.println(isarastrongNumber(num));
		
	/*
	 * Aramstrong number is very spl number
	 *  The Sum of each dight cube is same as given number
	 * 153
	 * 1*1*1=1
	 * 5*5*5=125
	 * 3*3*3=27
	 * 1+125+27=153
	 */

	}
	
	public static boolean isarastrongNumber(int no)
	{
		while(no>0)
		{
			r=no%10;
			no=no/10;
			s=s+(r*r*r);
		}
	
		
		if(s==temp)
		{
			return true;
		}
		return false;
		
		
	}

}
