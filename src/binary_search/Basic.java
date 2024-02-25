package binary_search;

public class Basic {
	
	static int binarysearch(int[] arr , int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		
		
		if(arr.length==0) {
			return -1;
		}
		
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
//			int mid = a/2;
			
			if (target < arr[mid]) {
				end = mid-1;
				
				
			}else if (target > arr[mid]) {
				start = mid+1;
				
			}else {
				
				return mid;
			}
			
			
			
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,16,17,18,19,20};
		int target = 16;
		
		int ans = binarysearch(arr,target);
		System.out.println(ans);
	}
	
}
