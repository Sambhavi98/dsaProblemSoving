package arrays;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		int arr[]= {6,-7,4,-2,1,5,-4};
		findMaxSum(arr);
		
		System.out.print(findMaxSum(arr));
		
	}
	public static int findMaxSum(int arr[]) {
		int maxSum=Integer.MIN_VALUE;
		int currSum=0;
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			if(currSum<0) {
				currSum=0;
			}
			if(currSum>maxSum) {
				maxSum=currSum;
			}
		}
		return maxSum;
	}
}
