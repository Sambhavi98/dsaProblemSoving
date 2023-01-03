package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {12,12,34,56,80,70,110,1000};
		reverse(arr);
		for(int e:arr)
		System.out.print(e+" ");
		
	}
	public static void reverse(int arr[]) {
		int j=arr.length-1;
		int i=0;
		while(i<j) {
			int temp=arr[i];
			arr[i++]=arr[j];
			arr[j--]=temp;
		}
		
	}
}
