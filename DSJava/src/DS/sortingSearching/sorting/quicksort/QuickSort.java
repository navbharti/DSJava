package DS.sortingSearching.sorting.quicksort;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {14, 33, 27, 10, 35, 19, 42, 44};
		
		System.out.println("Before sorting!!!");
		//print the array elements before sorting
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		
		System.out.println("\nSorted!!!");
		//call mergeSort() menthod
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("After sorting!!!");
		//print the array elements after sorting
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	
	/*
	 * this is the method to sort the array elements recursively
	 */
	public static void quickSort(int arr[], int low, int high) {
		//take the first element as the pivot element
		if(low<high) {
			int j = partition(arr, low, high);
			quickSort(arr, low, j-1);
			quickSort(arr, j+1, high);
		}
		
	}
	
	
	/*
	 * this is the method to partion the array into two half by pivot element 
	 */
	public static int partition(int arr[], int low, int high) {
		//take the first element as pivot element
		int pivot = arr[low];
		
		//initialize i-low, j=high
		int i=low, j=high;
		
		//repeat
		while (i<j) {
			do {
				i++;
			}while(arr[i]<pivot);
			
			do {
				j--;
			}while(arr[j]>pivot&&j<high);
			
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp = arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		
		return j;
		
	}


	

}
