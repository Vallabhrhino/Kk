package famousprograms;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Factorial Program");
		System.out.println("Enter The Number");
		
		int n = in.nextInt();
		int factorial = 1;
		
		for(int i = 1;i<=n;i++ ) {
			factorial *=i;
		}
		System.out.println(factorial);
	}

}
