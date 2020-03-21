package DS.sortingSearching.sorting.quicksort;

public class QuickSortTemplate {

	public static void main(String[] args) {
		int arr[] = {14, 33, 27, 10, 35, 19, 42, 44};
		
		System.out.println("Before sorting!!!");
		//print the array elements before sorting
		
		
		System.out.println("\nSorted!!!");
		//call mergeSort() menthod
		//quickSort(arr, 0, arr.length-1);
		
		System.out.println("After sorting!!!");
		//print the array elements after sorting
		
	}
	
	/*
	 * this is the method to sort the array elements recursively
	 * 
	 * 
	 * Step 1 − Choose the highest index value has pivot
	 * Step 2 − Take two variables to point left and right of the list excluding pivot
	 * Step 3 − left points to the low index
	 * Step 4 − right points to the high
	 * Step 5 − while value at left is less than pivot move right
	 * Step 6 − while value at right is greater than pivot move left
	 * Step 7 − if both step 5 and step 6 does not match swap left and right
	 * Step 8 − if left ≥ right, the point where they met is new pivot
	 */
	public static void quickSort(int arr[], int low, int high) {
		//Very first check for terminating condition
		if(low<high) {
			//call the partition() method and get the pivot element index
			int j = partition(arr, low, high);
			
			//call quickSort() for left sub-array recursively
			quickSort(arr, low, j-1);
			
			//call quickSort() for right sub-array recursively
			quickSort(arr, j+1, high);
		}
		
	}
	
	
	/*
	 * this is the method to partion the array into two half by pivot element 
	 */
	public static int partition(int arr[], int low, int high) {
		//take the first element as pivot element
		
		
		//initialize i=low, j=high
		int i=low;
		int j=high;
		
		//repeat till i and j do not crosses each other sides
		while (i<j) {
			
			//increase ith index till ith element is lesser than the pivot element
			
			
			//decrease jth index till jth element is greater than the pivot element
			
			
			//if i<j do swap(arr[i], arr[j])
			
		}
		
		//after loop terminates do swapt(pivot, arr[j])
		
		//return the index of sorted pivot element
		return j;
		
	}

}