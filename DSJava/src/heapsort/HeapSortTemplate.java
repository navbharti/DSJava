package heapsort;

public class HeapSortTemplate {

	public static void main(String[] args) {
		//create array with elements
		int arr[]= {4, 10, 3, 5, 1};
		
		//get the size of the array
		int n = arr.length;
		
		//print the elements of the array before sorting
		System.out.println("Array elements before sorting!!!");
		
		//call heapSort() method
		
		//print the elements of the array after sorting
		System.out.println("Array elements after sorting!!!");

	}
	
	//method to do sorting by deleting elements from heap
	/*
	 * 	Heap Sort Algorithm for sorting in increasing order:
	 *	1. Build a max heap from the input data.
	 *	2. At this point, the largest item is stored at the root of the heap. Replace it with the last item of the heap followed by reducing the size of heap by 1. Finally, heapify the root of tree.
	 *	3. Repeat above steps while size of heap is greater than 1.
	 */
	public static void heapSort(int arr[], int n) {
		//your code goes here.
		
	}
	
	
	//method to re-arrange all the elements following max-heap condition
	public static void heapify(int arr[], int n, int index) {
		//your code goes here.
		
	}

}
