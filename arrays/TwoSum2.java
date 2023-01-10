package arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		int arr[]= {2,7,11,15};
		int ans[]=twoSum(arr,9);
		System.out.print(ans[0]+" ,"+ans[1]);
	}

	public static int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int currSum=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            currSum=nums[left]+nums[right];
            if(currSum>target){
                right--;
            }
            else if(currSum<target){
                left++;
            }
            else{
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            }

        }
        return ans;
    }
}
