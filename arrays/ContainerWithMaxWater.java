package arrays;

public class ContainerWithMaxWater {

	public static void main(String[] args) {
		int arr[]= {1,8,6,2,4,5,8,3,7};
		System.out.print(findMaxArea(arr));
		
	}
	public static int findMaxArea(int arr[]) {
		int maxArea=Integer.MIN_VALUE;
		int currArea=0;
		int left=0,right=arr.length-1;
		while(left<right) {
			int distance=right-left;
			currArea=Math.min(arr[left], arr[right])*distance;
			if(maxArea<currArea) {
				maxArea=currArea;
			}
			if(arr[left]<=arr[right]) {
				left++;
			}
			else {
				right--;
			}
			
		}
		return maxArea;
	}
}
