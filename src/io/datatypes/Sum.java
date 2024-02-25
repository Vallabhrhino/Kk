package io.datatypes;

import java.util.Scanner;

public class Sum {

//	we have used static keyword here to access variable anywhere in the class.we dont have to create the object
	static void addition(int a ,int b) {
		
		 int s = a+b;
		 System.out.println("Addition :" +s);
		 
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the first number to add");
		int p = in.nextInt();
		System.out.println("Enter the Second number to add");
		int q = in.nextInt();
		
		addition(p,q);
		
		
		
		
	}
}
