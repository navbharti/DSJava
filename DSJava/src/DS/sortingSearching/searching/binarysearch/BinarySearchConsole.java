package DS.sortingSearching.searching.binarysearch;

import java.util.Scanner;

public class BinarySearchConsole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Read value of n
		int n = input.nextInt();
		
		//Create an array of n elements
		int arr[] = new int[n];
		
		//Read n elements and store in the array
		for(int i=0; i<n; i++)
			arr[i] =  input.nextInt();
		
		//sort the array elements
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//read the search key
		int key = input.nextInt();
		
		//apply binarySearch() method for the key, store the returned value in position
		int position = binarySearch(arr, n, key);
		
		//display the result
		if(position==-1)
			System.out.println("Data not found!!!");
		else
			System.out.println("Data found at position: "+position);
		
		input.close();
	}
	
	public static int binarySearch(int arr[], int n, int key) {
		int low=0, high=n-1, mid=low+high;
		while(low<=high) {
			if(arr[mid]==key)
				return mid+1;
			else if(arr[mid]>key)
				high = mid-1;
			else
				low = mid+1;
			
			mid=(low+high)/2;
		}
		return -1;
	}

}
