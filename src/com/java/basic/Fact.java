package com.java.basic;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();

		System.out.println(fact(num));

	}

	public static int fact(int num)
	{
		
		int f=1;
		if(num==0)
		{
			return 1;
		}
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		return f;
		
		
	}
}
