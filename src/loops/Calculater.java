package loops;

import java.util.Scanner;

public class Calculater {
	
	static void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	static void sub(int a,int b) {
		int c = a-b;
		System.out.println(c);
	}
	
	static void mul(int a,int b) {
	 int c = a*b;
		System.out.println(c);
	}
	
	static void div(int a,int b) {
		int c = a/b;
		System.out.println(c);
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner con = new Scanner(System.in);
		System.out.println("If you want to continue hit 1");
		System.out.println("If not hit 2");
		int che = con.nextInt();
		
				
		if(che==1) {
		System.out.println("Enter the Number of what you want to do");
		System.out.println("Addition - 1");
		System.out.println("Subtraction - 2");
		System.out.println("Multiplication - 3");
		System.out.println("Division - 4");
		
		Scanner in = new Scanner(System.in);
		int sel = in.nextInt();
		
		System.out.println("Enter the first number");
		int a = in.nextInt();
		
		System.out.println("Enter the second number");
		int b = in.nextInt();
		
		if(sel==1) {
			
			add(a,b);
			
		}
		else if(sel==2) {
			sub(a,b);
			
		}
		else if(sel==3) {
			mul(a,b);
		}
		else if(sel==4) {
			div(a,b);
		}
		}else {
			System.exit(0);
		}
	
	}

}
