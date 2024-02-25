package array;

import java.util.Arrays;

public class Reverse {
	
static void swap(int arr[],int index1,int index2) {
		
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
	
	static void rev(int arr[]) {
		int start =0;
		int end = arr.length-1;
		
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int vr [] = {5,3,4,5,5,6,7};
		
		rev(vr);
		System.out.println(Arrays.toString(vr));
		
	}

}
