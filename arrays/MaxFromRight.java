package arrays;

public class MaxFromRight {

	public static void main(String[] args) {
		int arr[]= {7,5,8,9,6,8,5,7,4,6};
		replaceElements(arr);
		for(int e:arr)
		System.out.print(e+" ");
		
	}
	public static void replaceElements(int arr[]) {
		int max=arr[arr.length-1];
		arr[arr.length-1]=0;
		for(int i=arr.length-2;i>=0;i--) {
			int temp=arr[i];
			arr[i]=max;
			if(max<temp)
				max=temp;
		}
		
	}
}
