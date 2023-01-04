package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

	public static void main(String[] args) {
		int arr[]= {2,7,6,4,1,3};
		ArrayList<Integer> leaders=findLeaders(arr);
		Collections.reverse(leaders);
		for(int e:leaders)
		System.out.print(e+" ");
		
	}
	public static ArrayList<Integer> findLeaders(int arr[]) {
		int max=arr[arr.length-1];
		ArrayList<Integer> leaders=new ArrayList<Integer>();
		leaders.add(max);
		for(int i=arr.length-2;i>=0;i--) {
			if(max<arr[i])
				leaders.add(arr[i]);
				max=arr[i];
		}
		return leaders;
	}
}
