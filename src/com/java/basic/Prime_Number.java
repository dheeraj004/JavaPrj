package com.java.basic;

import java.util.Scanner;

public class Prime_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int no;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		System.out.println(	isPrimeNumer(no));
	
		
		

	}
	
	public static boolean isPrimeNumer(int num)
	{
		if(num==0||num==1)
		{
			return false;
		}
		
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	

}
