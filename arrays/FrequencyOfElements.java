package arrays;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements one by one");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		printFrequencyOfDistinctEleemnts(arr);
	}

	public static void printFrequencyOfDistinctEleemnts(int arr[]) {
		int count=1;
		int i;
		if(arr.length==1) {
			System.out.println("Frequency of "+arr[0]+" is 1");
			return;
		}
		for(i=0;i<arr.length-1;i++) {
			
			if(arr[i]==arr[i+1]) {
					count++;
					continue;
				}
			if(i!=arr.length-2) {
				System.out.println("Frequency of "+arr[i]+" is "+count);
				count=1;
			}
			else {
				
				break;
			}
		}
		if((i==(arr.length-1))&&arr[i-1]==arr[i])
			System.out.println("Frequency of "+arr[i]+" is "+count++);
		else {
			System.out.println("Frequency of "+arr[i++]+" is "+count);
		}
		if((i==(arr.length-1))&&arr[i-1]!=arr[i])
			System.out.println("Frequency of "+arr[i]+" is 1");
	}
}
