package arrays;

public class LongestConsecutiveOnes {

	public static void main(String[] args) {
		int arr[]= {1,1,1,0,0,1,0,1,1,1,1,0,1};
		int max=findLongest(arr);
		System.out.println("The longest consecutive 1s' length is "+max);
	}
	public static int findLongest(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int maxLength=0;
		int currLength=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				currLength++;
			}
			else {
				currLength=0;
			}
			maxLength=Math.max(currLength,maxLength);
		}
		return maxLength;
	}
}
