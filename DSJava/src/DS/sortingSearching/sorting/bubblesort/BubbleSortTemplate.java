package DS.sortingSearching.sorting.bubblesort;

public class BubbleSortTemplate {

	public static void main(String[] args) {
		int arr[]= {4, 10, 3, 5, 1};
		
		//print the array elements before sorting
		System.out.println("Before Sorting!!!");
		printArray(arr);
		
		//call bubbleSort(arr, n);
		bubbleSort(arr, arr.length);
		
		//print the array elements after sorting
		System.out.println("\nAfter Sorting!!!");
		printArray(arr);

	}
	
	/*
	 * method to print array elements
	 */
	public static void printArray(int arr[]) {
		for(int a: arr)
			System.out.print(a+" ");
	}
	
	/*
	 * method to sort the given arr thrugh bubble sorting technique
	 */
	public static void bubbleSort(int arr[], int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					System.out.println("\t\t"+arr[j]+" and "+arr[j+1]);
					printArray(arr);
				}
			}
		}
	}
	
	/*
	 * method to swap jth and (j+1)th elements in a given array
	 */
	public static void swap(int arr[], int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

}
