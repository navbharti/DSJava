package DS.sortingSearching.searching.binarysearch;

import java.util.Scanner;

public class BinarySearchRecursive {

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
		int position = binarySearch(arr, 0, n-1, key);
		
		//display the result
		if(position==-1)
			System.out.println("Data not found!!!");
		else
			System.out.println("Data found at position: "+position);
		
		input.close();

	}

	/*
	 * Recursive method
	 * method: binarySearch
	 * @arg arr[]
	 * @arg low
	 * @arg high
	 * @arg key
	 */
	public static int binarySearch(int[] arr, int low, int high, int key)
	{
		// Terminating condition
		if (low > high) {
			return -1;
		}

		// mid index calculation
		int mid = (low + high) / 2;

		// overflow can happen. Use alternation formula for mid index calculation.
		// int mid = low + (high - low) / 2;

		// Search successful condition
		if (key == arr[mid]) {
			return mid+1;
		}

		// discard all elements in the right search space
		// including the mid element
		else if (key < arr[mid]) {
			return binarySearch(arr, low,  mid - 1, key);
		}

		// discard all elements in the left search space
		// including the mid element
		else {
			return binarySearch(arr, mid + 1,  high, key);
		}
	}
	
}