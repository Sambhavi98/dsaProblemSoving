package arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {120,34,56,80,11,23,1000};
		int max=findSecondLargest(arr);
		System.out.println("The second largest element is "+max);
	}
	public static int findSecondLargest(int arr[]) {
		if(arr.length<2) {
			return -1;
		}
		int largest=0;
		int secondLargest=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				secondLargest=largest;
				largest=i;
			}
			else if(arr[i]<arr[largest]) {
				if(secondLargest==-1||arr[i]>arr[secondLargest]) {
				secondLargest=i;
				}
			}
			
		}
		return arr[secondLargest];
	}
}
