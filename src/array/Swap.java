package array;

import java.util.Arrays;

public class Swap {
	
	static void swap(int arr[],int index1,int index2) {
		
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[]= {5,4,6,7,4,9};
		swap(arr,0,4);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
