package arrays;

public class ThirdLargest {

	public static void main(String[] args) {
		int arr[]= {120,34,56,800,11,203,100};
		int max=findThirdLargest(arr);
		System.out.println("The third largest element is "+max);
	}
	public static int findThirdLargest(int arr[]) {
		if(arr.length<3) {
			return -1;
		}
		int largest=0;
		int secondLargest=-1;
		int thirdLargest=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				thirdLargest=secondLargest;
				secondLargest=largest;
				largest=i;
			}
			else if(arr[i]<arr[largest]) {
				if(secondLargest==-1||arr[i]>arr[secondLargest]) {
				secondLargest=i;
				}
				else if(thirdLargest==-1||(arr[i]>arr[thirdLargest]&&arr[i]<arr[secondLargest])) {
					thirdLargest=i;
				}
			}
			
		}
		return arr[thirdLargest];
	}
}
