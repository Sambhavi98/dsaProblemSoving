package arrays;
//Given an array arr[] find the maximum j-i such that arr[j]>arr[i]

public class MaximumDifference {

	public static void main(String[] args) {
		int arr[]= {5,4,1,7,2,8,6,3,4};
		System.out.print(findMaximumDifference(arr));
	}
	
	public static int findMaximumDifference(int arr[]) {
		int ans=0;
		int size=arr.length;
		int leftMin[]=new int[size];
		leftMin[0]=arr[0];
        for(int i=1;i<size;i++){
            leftMin[i]=Math.min(arr[i],leftMin[i-1]);
        }
		int rightMax[]=new int[size];
		rightMax[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }
        int i=0,j=0;
        while(i<size&&j<size) {
        	if(rightMax[j]>leftMin[i]) {
        		ans=Math.max(ans, j-i);
        		j++;
        	}
        	else {
        		i++;
        	}
        }
        
		return ans;
	}

}
