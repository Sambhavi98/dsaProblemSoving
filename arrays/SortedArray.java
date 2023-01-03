package arrays;

public class SortedArray {

	public static void main(String[] args) {
		int arr[]= {12,12,34,56,80,70,110,1000};
		boolean ans=isSorted(arr);
		if(ans)
			System.out.println("The array is sorted ");
		else
			System.out.println("The array is not sorted ");
	}
	public static boolean isSorted(int arr[]) {
		boolean flag=true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=arr[i+1]) {
				continue;
			}
			else {
				flag=false;
				break;
			}
		}
		return flag;
	}
}
