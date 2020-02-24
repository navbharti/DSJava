package searching;

public class LinearSearch {

	public static void main(String[] args) {
		/***********************************************
		 * Algorithm linearSearch(A, n, key)
		 * Begin
		 * 	for(i=0; i<n; i++)
		 * 		if(A[i]==key)
		 * 			return i;
		 *	return -1;
		 * End
		 ************************************************/
		int arr[] = {100, 5, 70, 10, 80, 88, 71, 30, 600, 15};
		int key = 15;
		int position = linearSearch(arr, arr.length, key);
		if(position==-1)
			System.out.println("Data is not found!!!");
		else
			System.out.println("Data found at position: "+position);
	}
	
	public static int linearSearch(int arr[], int n, int key) {
		for(int i=0; i<n; i++)
			if(arr[i]==key)
				return i+1;
		return -1;
	}

}
