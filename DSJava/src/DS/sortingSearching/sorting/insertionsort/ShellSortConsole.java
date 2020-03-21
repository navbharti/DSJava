package DS.sortingSearching.sorting.insertionsort;

public class ShellSortConsole {

	public static void main(String[] args) {
		int arr[] = {35, 33, 42, 10, 14, 19, 27, 44};
		
		System.out.println("Data before sorting: ");
		for(int a: arr)
			System.out.print(a+" ");
		//call shellsort() method
		shellSort(arr, arr.length);

		System.out.println("\nData after sorting: ");
		for(int a: arr)
			System.out.print(a+" ");

	}

	//shellSort()
	public static void shellSort(int arr[], int n) {
		//initialize/find the gap using Knuth formula
		int gap=1;
		while(gap<arr.length/3)
			gap = gap*3 + 1;

		int iteration =0;
		//iterate for each sublist
		while(gap>0) {
			System.out.println("\nIteration: "+iteration);
			//create virtual sublist in the original array
			for(int i=gap; i<arr.length; i++) {
				
				//select the key to insert
				int key = arr[i];
				int j=i;
				
				//shift all elements those area greater or equal to the key to be inserted.
				while(j>gap-1 && arr[j-gap]>=key) {
					//shifting logic
					arr[j]=arr[j-gap];
					j=j-gap;
					System.out.println("\t\t"+arr[j]+" is shifted");
				}
				
				//swap the number at identified appropriate place
				arr[j]=key;
				System.out.println("\t"+key + " is inserted to its place");
			}
			
			//recalculate the gap for next iteration
			gap = (gap-1)/3;
			
			iteration++;
		}
	}
}
