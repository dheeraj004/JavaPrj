package com.java.basic;

import java.util.Scanner;

public class PalindromeNumber {
	
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
		System.out.println(ispalindromeNumber(num));
		
	

	}
	
	public static boolean ispalindromeNumber(int no)
	{
		while(no>0)
		{
			r=no%10;
			no=no/10;
			s=(s*10)+r;
		}
	
		
		if(s==temp)
		{
			return true;
		}
		return false;
		
		
	}

}
