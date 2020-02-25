package insertionsort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		int arr[]=new int[n];
		
		//Rean n elements in the Array System.out.println("Enter n elements: ");
		for(int i=0; i<n; i++)
			arr[i]=input.nextInt();
		
		//Print the Array Elements Before Sorting
		System.out.println("Data before sorting: ");
		for(int a: arr)
			System.out.print(a+" ");
		
		//Insertion sort
		for(int i=1; i<n; i++) {
			int j = i-1;
			int key = arr[i];
			
			while(j>=0 && (arr[j]>key)) {
				arr[j+1]=arr[j];
				j = j -1;
			}
			arr[j+1]=key;
		}
		
		//Print the Array Elements after sorting
		System.out.println("\nData After sorting: ");
		for (int a: arr)
			System.out.print(a+" ");
		
	}

}
