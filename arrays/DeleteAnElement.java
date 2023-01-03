package arrays;

public class DeleteAnElement {

	public static void main(String[] args) {
		int arr[]= {12,34,56,89,11,23,100};
		int key=56;
		int ans=delete(arr,key);
		if(ans==arr.length) {
			for(int e:arr) {
				System.out.print(e+" ");
			}
		}
		else {
			for(int i=0;i<arr.length-1;i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static int delete(int arr[],int key) {
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]==key) {
				break;
			}
		}
		if(i==arr.length)
			return arr.length;
		else {
			for(int j=i;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				arr[j+1]=0;
			}
			return arr.length-1;
		}
	}
}
