package matrices;

public class RotateMatrix {

	public static void main(String[] args) {
		int arr[][]= {{2,3,1},{1,4,3},{-2,6,7}};
		printMatrix(arr);
		System.out.println("After roatating 90 degree matrix is:");
		rotate(arr);
	}
	public static void rotate(int arr[][]) {
		transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][(arr.length-1)-j];
				arr[i][(arr.length-1)-j]=temp;
			}
			
		}
		printMatrix(arr);
			
	}
	public static void transpose(int arr[][]) {
			
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
			
		}
		
	}
	public static void printMatrix(int arr[][]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
