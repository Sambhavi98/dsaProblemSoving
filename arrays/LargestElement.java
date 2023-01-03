package arrays;

public class LargestElement {

	public static void main(String[] args) {
		int arr[]= {-120,34,56,809,11,23,100};
		int max=findLargest(arr);
		System.out.println("The largest element is "+max);
	}
	public static int findLargest(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		return arr[max];
	}
}
