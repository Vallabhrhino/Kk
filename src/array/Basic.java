//Kunal kushwah lecture
package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Basic {
	
	
//	Arrays are mutable
//	static void change(int arr[]) {
//		int nums[]= {1,2,3,4,5};
//		arr[1]=12;
//	}

	public static void main(String args[]) {
		
//		int[] a = new int[5];
//		int[] b = {12,22,33,44};
//		int arr[] = new int[5];
//		arr[0] = 12;
//		arr[1] = 15;
//		arr[3] = 16;
//		arr[4] = 17;
//		System.out.println(arr[3]);
		
		
//		Array input using loops
		
//		Scanner in = new Scanner(System.in);
//		int arr[] = new int[5];
//		for(int i = 0; i < arr.length; i++) {
//			
//			System.out.println("Enter Your Number");
//			arr[i] = in.nextInt(); 
//			
//			
//		}
//		System.out.println("This is your Array");
//		for(int i = 0; i < arr.length; i++){
//			
//			
//			System.out.println(arr[i]);
//			
//		}
//		
////		for each loop
//		
//		for(int num : arr) {
//			System.out.println(num);
//		}
		
		
//		Arrays are mutable in java
//		int nums[]= {1,2,3,4,5};
//		change(nums);
//		System.out.println(Arrays.toString(nums));
		
//		Multidimensional array
		
//		2D declaration
//		int arr[][]= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//				};
//		
//		2d input
//		int arr[][] = new int[3][2];
//		Scanner in = new Scanner(System.in);
//		for(int row = 0; row < arr.length ;row++) {
//			for(int col =0 ; col < arr[row].length ; col++)	{
//				arr[row][col]=in.nextInt();			}
//			
//		}
//		
//		for(int row = 0; row < arr.length ;row++) {
//			for(int col =0 ; col < arr[row].length ; col++)	{
//				System.out.print(arr[row][col] + " ");		}
//			System.out.println();
//			
//		}
		
		
		
		
		
//		Arraylist
		
		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		Scanner in = new Scanner(System.in);
//		
//		for(int i = 0; i < 5; i++) {
//			list.add(in.nextInt());
//		}
//		
//		System.out.println(list);
//	}
		
//		Multidimensional ArrayList
		Scanner in = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3;col++) {
				list.add(new ArrayList<>());
			}
		}
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3;col++) {
				list.get(row).add(in.nextInt());
			}
		}
		
		
		
		
		
	}	
	
}
