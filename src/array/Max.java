package array;

public class Max {
	
	static int max(int [] arr) {
		int maxval = arr[0];
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]>maxval) {
				maxval = arr[i];
				
			}
			
		}
		return maxval;
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {22,555,67,34,56,7,76,87,98,89,45};
		
		System.out.println(max(arr));
	}

}
