package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {14, 33, 27, 10, 35, 19, 42, 44};
		
		System.out.println("Before sorting!!!");
		//print the array elements before sorting
		
		System.out.println("Sorted!!!");
		//call mergeSort() menthod
		
		System.out.println("After sorting!!!");
		//print the array elements after sorting
		

	}
	
	/*
	 * this is the method to sort the array elements recursively
	 */
	public static void mergeSort(int arr[], int left, int right) {
		//check for terminating condition
		
		//calculation mid index
		
		//call mergeSort() method for left side sub-array
		
		//call mergeSort() method for right side sub-array
		
		//call merge() method to merge left side-array and right side-array
		
	}
	
	
	/*
	 * this is the method to merge elements of two sorted arrays 
	 */
	public static void merge(int arr[], int left, int mid, int right) {
		//find size of left side-array
		int n1=0;
		
		//find size of right side-array
		int n2=0;
		
		//create separate array for left side-array with size n1
		int leftArr[];
		
		//create separate array for right side-array with size n2
		int rightArr[];
		
		//copy all the left side sub-array elements from original array arr[] to leftArr[]
		for(int i=0; i<n1; i++) {
			
		}
		//copy all the right side sub-array elements from original array arr[] to rightArr[]
		for(int j=0; j<n2; j++) {
			
		}
		
		//initialize i=0, j=0 and k=left
		int i=0;
		int j=0; int k = left;
		
		//merge all the elements from both the array leftArr[] and rightArr[] in sorted order 
		//and store in the original array arr[]
		while(left<n1 && right<n2) {
			
			
		}
		
		//copy all the remaining elements from leftArr[] 
		
		
		//copy all the remaining elements from rightArr[]
	}
	

}
