package Arrays;
import java.util.Arrays;

public class Solution {
	
	public static int[] twoSum(int[] nums, int target) {  
        
	    
	 	int[] x = new int[2]; 
	 
        int sum  = 0; 
        for (int i = 0 ; i <= nums.length; i++) {
             
            sum = nums[i] + nums[i + 1]; 
            if (sum == target) {
                x[0] = nums[i]; 
                x[1] = nums[i + 1]; 
                break; 
            }
        }
        return x; 
   
	}

	public static void main(String[] args) {
//		int[] x = {2, 7, 11, 15}; 
//		System.out.println(twoSum(x, 9)); 
//     System.out.println(2 % 3);		
//     
//     String x = "ABCD"; 
//     int pos = 3; 
//     for (int i = 0; i <= pos; i++) {
//    	 System.out.println(x.substring(pos, pos+1));
//     }
	int x = 0; 
	int y = 0; 
	int z = 0; 
     
     if (x == 0) {
    	 if (y ==1)
    		 z+=2;
     } else {
    	 z += 4;
     }
     System.out.println(z);
    
}

}
