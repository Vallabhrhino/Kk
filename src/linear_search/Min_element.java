package linear_search;

public class Min_element {
	
	static int min(int[] arr) {
		
		if(arr.length==0) {
			System.out.println("Array is empty");
		}
		int max= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max) {
				
				max=arr[i];
			}
			
		}
		return max;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int [] arr = {13,13,45,67,8,9,34,5,6,77,7,23,4,66,44,5,6};
		
		int ans = min(arr);
		System.out.println(ans);
		
	}

}
