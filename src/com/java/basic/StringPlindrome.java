package com.java.basic;

public class StringPlindrome {
	
	public static void main(String[] args) {
		String ori="aba";
		
		String rev="";
		
		int strlen=ori.length();
		for(int i=strlen-1;i>=0;i--)
		{
			rev=rev+ori.charAt(i);
		}
		
		if(rev.equals(ori))
		{
			System.out.println("Given string is palindrome");
		}
		
		else
		{
			System.out.println("Given string is not palindrome");
		}
		
	}

}
