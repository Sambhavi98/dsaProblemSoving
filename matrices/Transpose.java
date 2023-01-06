package matrices;

public class Transpose {

	public static void main(String[] args) {
		int arr[][]= {{2,3,1},{1,4,3},{-2,6,7}};
		printMatrix(arr);
		System.out.println("Transpose of the matrix is:");
		transpose(arr);
	}
	public static void transpose(int arr[][]) {
			
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
			
		}
		printMatrix(arr);
			
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
