package DS.sortingSearching.sorting.mergesort;

import java.util.Scanner;

public class MergeSortConsole {
	
	public static void main(String[] args) {

		//int arr[] = {14, 33, 27, 10, 35, 19, 42, 44};
		Scanner input = new Scanner(System.in);
		//Read value of n
		System.out.println("Enter array size: ");
		int size = input.nextInt();
		
		//Create array with size
		int arr[]=new int[size];
		
		//Read elements in the array
		System.out.println("Enter "+size+" Space Separate Elements: ");
		for(int i=0; i<size; i++)
			arr[i]=input.nextInt();
		
		System.out.println("Before sorting!!!");
		//print the array elements before sorting
		for(int i=0; i<size; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\nSorted!!!");
		//call mergeSort() menthod
		mergeSort(arr, 0, size-1);
		
		System.out.println("After sorting!!!");
		//print the array elements after sorting
		for(int i=0; i<size; i++)
			System.out.print(arr[i]+" ");
		
		//close the Scanner object
		input.close();

	}
	
	/*
	 * this is the method to sort the array elements recursively
	 */
	public static void mergeSort(int arr[], int left, int right) {
		//check for terminating condition
		if(right>left) {
			//calculation mid index
			int mid = (left+right)/2;
			
			//call mergeSort() method for left side sub-array
			mergeSort(arr, left, mid);
			
			//call mergeSort() method for right side sub-array
			mergeSort(arr, mid+1, right);
			
			//call merge() method to merge left side-array and right side-array
			merge(arr, left, mid, right);
		}
	}
	
	
	/*
	 * this is the method to merge elements of two sorted arrays 
	 */
	public static void merge(int arr[], int left, int mid, int right) {
		//find size of left side-array
		int n1=mid-left+1;
		
		//find size of right side-array
		int n2=right-mid;
		
		//create separate array for left side-array with size n1
		int leftArr[]=new int[n1];
		
		//create separate array for right side-array with size n2
		int rightArr[]=new int[n2];
		
		//copy all the left side sub-array elements from original array arr[] to leftArr[]
		for(int i=0; i<n1; i++) {
			leftArr[i]=arr[left+i];
		}
		//copy all the right side sub-array elements from original array arr[] to rightArr[]
		for(int j=0; j<n2; j++) {
			rightArr[j]=arr[mid+1+j];
		}
		
		//initialize i=0, j=0 and k=left
		int i=0;
		int j=0; int k = left;
		
		//merge all the elements from both the array leftArr[] and rightArr[] in sorted order 
		//and store in the original array arr[]
		while(i<n1 && j<n2) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			}else {
				arr[k]=rightArr[j];
				j++;
			}
			
			k++;
			
		}
		
		//copy all the remaining elements from leftArr[] 
		while(i<n1){
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		
		//copy all the remaining elements from rightArr[]
		while(j<n2) {
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	

}
