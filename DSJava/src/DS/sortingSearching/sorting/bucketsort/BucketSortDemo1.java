package DS.sortingSearching.sorting.bucketsort;

import java.util.Arrays;
public class BucketSortDemo1 {

	public static void main(String[] args) {
		int arr[]= {77, 46, 6 ,65, 17, 85, 19, 64, 47, 52, 17};
		System.out.println(Arrays.toString(arr));
		Bucket_Sort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Bucket_Sort(int arr[], int n)  
	{    
	    int i, j;    
	    int count[]=new int[findMax(arr)+1];   
	    //for (i = 0; i < count.length; i++)  
	      //  count[i] = 0;  
	   
	    for (i = 0; i < arr.length; i++)  
	        count[arr[i]]++;  
	   
	    for (i = 0, j = 0; i < count.length; i++)    
	        for(; count[i] > 0; count[i]--)  
	            arr[j++] = i;  
	}   
	
	public static int findMax(int arr[]) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}

}
