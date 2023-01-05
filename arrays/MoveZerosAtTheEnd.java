package arrays;

public class MoveZerosAtTheEnd {

	public static void main(String[] args) {
		int arr[]= {0,8,0,1,3,0,0,5,0};
		int ans[]=moveZeros(arr);
		for(int e:ans)
			System.out.print(e+" ");
	}
	public static int[] moveZeros(int arr[]) {
			int j=0;
			for(int i=0;i<arr.length;i++) {
			
			if(arr[j]!=0&&arr[i]!=0) {
				j++;
			}
			else if(arr[j]==0&&arr[i]!=0) {
				arr[j]=arr[i];
				arr[i]=0;
				j++;
			}
			
			
		}
		return arr;
	}
}
