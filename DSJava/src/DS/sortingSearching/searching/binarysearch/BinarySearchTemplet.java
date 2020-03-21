package DS.sortingSearching.searching.binarysearch;

public class BinarySearchTemplet {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		BinarySearchData binarySearchData = new BinarySearchData(arr);
		binarySearchData.display();
		System.out.println("Total Elements: "+binarySearchData.getSize());
		System.out.println("5 in arr: "+binarySearchData.binarySearch(50));
	}

}

//Seperate class BinarySearchData which has array and its size as data members and different methods as its  behaviour
class BinarySearchData{
	int arr[], size;
	
	BinarySearchData(int arr[]){
		size = arr.length;
		this.arr=arr;
	}
	
	public void display() {
		System.out.println("Total Elements: "+size);
		for(int a: arr)
			System.out.print(a+" ");
	}
	
	public int getSize() {
		return size;
	}
	
	public int[] getData() {
		return this.arr;
	}
	
	public int binarySearch(int key) {
		int left=0, right=size-1, mid;
		while(left<=right) {
			mid=left+(right-left)/2;
			if(arr[mid]==key)
				return mid+1;
			else if(arr[mid]<key)
				left = mid+1;
			else
				right = mid-1;
		}
		return -1;
	}
}