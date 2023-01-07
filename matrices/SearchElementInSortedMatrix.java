package matrices;

public class SearchElementInSortedMatrix {

	public static void main(String[] args) {
		int arr[][]= {{1,4,5,7},{2,5,6,9},{6,10,11,13},{8,12,15,28}};
		int key=14;
		boolean found=search(arr,key);
		System.out.println(found);
	}
	public static boolean search(int arr[][],int key) {
		int row=0;
		int col=arr.length-1;
		while(row<arr.length&&col>=0) {
			if(arr[row][col]==key) {
				System.out.println("Element is found at index"+row+","+col);
				return true;
			}
			else if(arr[row][col]<key) {
				row++;
			}
			else {
				col--;
			}
			
		}
		return false;
	}
}
