package DS.sortingSearching.sorting.bucketsort;

public class BucketSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxVal(int arr[]) {
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}
	
	public static int digits(int num) {
		int count=0;
		while(num != 0)
	    {
	        /* Increment digit count */
	        count++;

	        /* Remove last digit of 'num' */
	        num /= 10;
	    }
		return count;
	}
	public static void bucketSort(int arr[], int n) 
	{ 
	    // 1) Create n empty buckets 
	    int b[][]=new int[10][n]; 
	     
	    // 2) Put array elements in different buckets 
	    int max = maxVal(arr);
	    int d=digits(max);
	    for(int j=1; j<=arr.length; j++)
	    {
	    		int index=0;
		    	for (int i=0; i<n; i++) 
				    { 
				       int bi = arr[i]%10; // Index in bucket 
				       b[bi][index++]=arr[i]; 
				    } 
		    	index =0;
		    	for(int i=0; i<10; i++) {
		    		for(int k=0; k<b[i].length; k++)
		    			arr[index]=b[i][k];
		    	}
	    }
	  
	    // 3) Sort individual buckets 
	    //for (int i=0; i<n; i++) 
	      // sort(b[i].begin(), b[i].end()); 
	  
	    // 4) Concatenate all buckets into arr[] 
	    int index = 0; 
	    for (int i = 0; i < n; i++) 
	        for (int j = 0; j < b[i].size(); j++) 
	          arr[index++] = b[i][j]; 
	} 
}
