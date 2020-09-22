package com.java.basic;

import java.util.HashSet;
import java.util.Set;

public class DublicateWord {

	public static void main(String[] args) {
	
		String[] names= {"java","java"};
		
		Set<String> s1=new HashSet<String>();
		
		for(String name:names)
		{
			if(s1.add(name)==false)
			{
				System.out.println("Duplicate Number is:"+name);
			}
		}
		

	}

}
