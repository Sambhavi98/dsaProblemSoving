package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		int arr[]= {2,3,1,1,4,3,-2};
		System.out.print(isSubArrayWithZeroSum(arr));
	}
	public static boolean isSubArrayWithZeroSum(int arr[]) {
			Set<Integer> prefix=new HashSet<>();
			int sum=0;
			for(int i=1;i<arr.length;i++) {
				sum+=arr[i];
				if(prefix.contains(sum)) {
					return true;
				}
				prefix.add(sum);
				
			}
			
			
		return false;
	}
}
