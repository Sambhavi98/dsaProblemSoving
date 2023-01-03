package arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[]= {2,2,2,3,4,5,5,7,7,7,7};
		int len=removeDuplicates(arr);
		for(int i=0;i<len;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	
	public static int removeDuplicates(int[] arr) {
		if(arr.length<2) {
			return -1;
		}
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		j++;
		return j;
	}
}
