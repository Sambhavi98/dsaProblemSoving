package arrays;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		boolean flag=false;
		System.out.println("Enter elements one by one");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int key=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				System.out.println("Element found at index "+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
			System.out.println("Not Found!");
		

	}

}
