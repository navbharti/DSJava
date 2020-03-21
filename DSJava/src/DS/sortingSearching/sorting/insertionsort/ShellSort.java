package DS.sortingSearching.sorting.insertionsort;

public class ShellSort {

	public static void main(String[] args) {
		int arr[] = {35, 33, 42, 10, 14, 19, 27, 44};
	
		System.out.println("Data before sorting: ");
		for(int a: arr)
			System.out.print(a+" ");
		//call shellsort() method
		shellSort(arr, arr.length);

		System.out.println("Data after sorting: ");
		for(int a: arr)
			System.out.print(a+" ");
	}
	
	public static void shellSort(int arr[], int n) {
		int interval = 1;
		while(interval < arr.length)
			interval = interval * 3+1;
		
		int iteration = 0;
		while(interval>0) {
			System.out.println("\nIteration: "+iteration);
			for(int outer=interval; outer<arr.length; outer++) {
				int key = arr[outer];
				int inner = outer;
				
				while(inner > interval-1 && arr[inner-interval] >= key) {
					arr[inner] = arr[inner-interval];
					inner = inner-interval;
					System.out.println("\t\t"+arr[inner]+" is shifted");
				}
				
				arr[inner] = key;
				System.out.println("\t"+arr[inner]+" is inserted at its place");
			}
			
			interval  = (interval-1)/3;
			
			iteration++;
		}
	}

}
