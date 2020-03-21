package DS.sortingSearching.sorting.heapsort;

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
		//re-arrange the given arr element according to Max-Heap condition
		for(int i=n/2-1; i>=0; i--) {
			//call heapify() method
		}
		
		for(int i=n-1; i>=0; i--) {
			//swap(arr[i], arr[0])
			
			//call heapify() method
		}
		
	}
	
	
	//method to re-arrange all the elements following max-heap condition
	public static void heapify(int arr[], int n, int index) {
		//your code goes here.
		//get the ith index as largest index
		int largest = index;
		
		//calculate left-child index and store in l
		
		//calculate right-chile index and store in r
		
		//check whether left-child element is greater than the largest index element.
		
		//check whether right-chile element is lesser than the largest index element.
	
		//check whether largest index is not equal to ith index 
		if(largest!=index) {
			//swap(arr[i], arr[largest])
			
			//call heapify(arr, n, largest) method 
		}
	
	}

}
