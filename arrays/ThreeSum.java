package arrays;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int arr[]= {1,2,4,7,3,5,-2,1};
		boolean ans=threeSum(arr,9);
		System.out.print(ans);
	}

	public static boolean threeSum(int[] nums, int target) {
      Arrays.sort(nums);
        for(int ind=0;ind<nums.length;ind++) {
        	int currSum=target-nums[ind];
        	if(twoSum(nums,currSum,ind)) {
        		return true;
        	}
        	
        }
        return false;
    }
	public static boolean twoSum(int[] nums, int target,int i) {
        int currSum=0;
        int left=0;
        int right=nums.length-1;
        while(left<right&&left!=i&&right!=i){
        	if(left==i) {
        		left++;
        		continue;
        	}
        	if(right==i) {
        		right--;
        		continue;
        	}
            currSum=nums[left]+nums[right];
            if(currSum>target){
                right--;
            }
            else if(currSum<target){
                left++;
            }
            else{
                return true;
            }

        }
        return false;
    }
}
