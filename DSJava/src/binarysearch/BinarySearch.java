package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		int n = arr.length;
		int key = 450;
		int position = binarySearch(arr, n, key);
		if(position==-1)
			System.out.println("Data not found!!!");
		else
			System.out.println("Data found at position: "+position);
	}
	
	public static int binarySearch(int arr[], int n, int key) {
		int low=0, high=n-1, mid;
		while(low<high) {
			mid = (low+high)/2;
			if(arr[mid]==key)
				return mid+1;
			else if(arr[mid]<key)
				low = mid+1;
			else if(arr[mid]>key)
				high = mid-1;
		}
		return -1;
	}

}
