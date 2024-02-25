package linear_search;

//For integer searching in an array


//public class Basic {
//	
//	static int linearSearch(int[] arr,int target) {
//		if(arr.length==0) {
//			return -1;
//		}
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			int element=arr[i];
//			int t;
//			if(element==target) {
//				return i;
//			}
//			
//		}
//		
//		return -1;
//		
//	}
//	
//	
//	public static void main(String[] args) {
//
//		int [] arr = {1,12,45,56,89,78,53};
//		int target = 56;
//		int ans = linearSearch(arr,target);
//		
//		if(ans==-1) {
//			System.out.println("Element did not found");
//		}else {
//			System.out.println("Element present at index: " +ans);
//		}
//		
//		
//	}
//
//}





//Searching in strings


public class Basic{
	
	static String linearSearch(String name,char target) {
		
		if(name.length()==0) {
			System.out.println("String not present");
		}
		
		for(int i=0; i < name.length();i++) {
			char element=name.charAt(i);
			
			
			if(element==target) {
				
				System.out.println("you character present at index:"+i);
				
			}
			
			
		}
		
		
		return "Character not found";
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		String name ="Vallabh";
		char target = 'h';
		
		linearSearch(name,target);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}













































