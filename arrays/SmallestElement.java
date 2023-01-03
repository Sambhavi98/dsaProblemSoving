package arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int arr[]= {120,34,56,809,11,23,100};
		int min=findSmallest(arr);
		System.out.println("The smallest element is "+min);
	}
	public static int findSmallest(int arr[]) {
		if(arr.length==0) {
			return 0;
		}
		int min=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[min]) {
				min=i;
			}
		}
		return arr[min];
	}
}
