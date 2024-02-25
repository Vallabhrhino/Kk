package exception;
import java.io.*;
import java.util.*;

public class Throw_Vs_Throws {
	
//	Throw always throws exception
//	    public static void main(String[] args)
//	    {
//	        // Use of unchecked Exception
//	        try {
//	             double x=3/1;
//	            throw new ArithmeticException();
//	        }
//	        catch (ArithmeticException e) {
//	            e.printStackTrace();
//	        }
//	    }
	
	
	// Java program to demonstrate the working
	// of throws keyword in exception handling
//    Throws only thorows exception when exception really happens
	

		
			public static int div(int a,int b)throws Exception {
				int c = a/b;
				return c;
			
		}

		public static void main(String[] args) throws Exception
		{
			try {
				int k = div(2,0);
				System.out.println(k);
			}
			catch (Exception e) {
				System.out.println(e);
			}			
			
			
		}
	

	
	
	
	
	
	}


