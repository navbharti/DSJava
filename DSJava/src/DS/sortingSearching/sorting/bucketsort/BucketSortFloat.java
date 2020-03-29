package DS.sortingSearching.sorting.bucketsort;

import java.util.ArrayList;

public class BucketSortFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void bucketSort(float arr[], int n) 
	{ 
	    // 1) Create n empty buckets 
	    ArrayList<Float> b[]=new ArrayList[n]; 
	     
	    // 2) Put array elements in different buckets 
	    for (int i=0; i<n; i++) 
	    { 
	       int bi = (int)(n*arr[i]); // Index in bucket 
	       b[bi].add(arr[i]); 
	    } 
	  
	    // 3) Sort individual buckets 
	    for (int i=0; i<n; i++) 
	       sort(b[i]); 
	  
	    // 4) Concatenate all buckets into arr[] 
	    int index = 0; 
	    for (int i = 0; i < n; i++) 
	        for (int j = 0; j < b[i].size(); j++) 
	          arr[index++] = b[i][j]; 
	} 
}