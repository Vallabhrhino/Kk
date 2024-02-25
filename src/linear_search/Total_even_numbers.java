package linear_search;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Total_even_numbers {
	
	
	public static int findNumbers(int[] nums) {

        int total=0;
        for(int i=0;i<nums.length;i++){
        int digits = count(nums[i]);
        if(digits%2==0){
            total = total+1;
        }
        }
        return total;
    }

    static int count(int num){
        int digit = 0;

        while(num>0){
            digit++;
            num = num/10;
        }
        return digit;
    }


    public static void main(String[] args){

        int[] arr = {1234,4545,455,677,876,889,34566,5578,33467,9887};
        int ans = findNumbers(arr);
        System.out.println(ans);

    }
	

	
	
	
	
	
	
	
	
	
	
}
