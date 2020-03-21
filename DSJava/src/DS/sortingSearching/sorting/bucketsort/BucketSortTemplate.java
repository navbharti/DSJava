package DS.sortingSearching.sorting.bucketsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BucketSortTemplate {

		//comparator instance member
	    private final Comparator<Integer> comparator;

	    /*
	     * Default constructor initializes comparator with naturalOrder
	     */
	    public BucketSortTemplate() {
	        comparator = Comparator.naturalOrder();
	    }

	    public static void main(String[] args) {
			//Create instance of ArrayList
			int arr[]= {77, 46, 6 ,65, 17, 85, 19, 64, 47, 52, 17};
			List<Integer> array=new ArrayList<Integer>();
			for(int a: arr)
				array.add(a);
			//Print the elements before sorting
			System.out.println("Before Sorting!!!");
			for(int i=0; i<array.size(); i++)
				System.out.print(array.get(i)+" ");
			
			//Create instance of class to call sort() method
			BucketSortTemplate obj = new BucketSortTemplate();
			array = obj.bucketSort(array);
			
			//Print the elements after sorting
			System.out.println("\nAfter Sorting!!!");
			for(int i=0; i<array.size(); i++)
				System.out.print(array.get(i)+" ");
			
		}
	    
	    /*
	     * method to do bucket sort
	     * source: https://www.baeldung.com/java-bucket-sort
	     */
	    public List<Integer> bucketSort(List<Integer> arrayToSort) {

	    	//Create buckets and split original data into bucket list
	        List<List<Integer>> buckets = splitIntoUnsortedBuckets(arrayToSort);

	    	//call sort() method to sorting each individual bucket
	        for(List<Integer> bucket  : buckets){
	            bucket.sort(comparator);
	        }

	        //call concatenate() method to concatenate sorted buckets into one list and return the sorted list
	        return concatenateBuckets(buckets);
	    }

	    /*
	     * method to concatenate individual lists of buckets into one list
	     */
	    private List<Integer> concatenateBuckets(List<List<Integer>> buckets){
	        List<Integer> sortedArray = new LinkedList<>();
	        for(List<Integer> bucket : buckets){
	            sortedArray.addAll(bucket);
	        }
	        return sortedArray;
	    }

	    /*
	     * method to split original data into different buckets by hash()
	     */
	    private List<List<Integer>> splitIntoUnsortedBuckets(List<Integer> initialList){

	        final int max = findMax(initialList);
	        final int numberOfBuckets = (int) Math.sqrt(initialList.size());

	        List<List<Integer>> buckets = new ArrayList<>();
	        for(int i = 0; i < numberOfBuckets; i++) 
	        	buckets.add(new ArrayList<>());

	        //distribute the data
	        for (int a : initialList) {
	        	int bucketIndex=hash(a, max, numberOfBuckets);
	            buckets.get(bucketIndex).add(a);
	        }
	        return buckets;

	    }

	    /*
	     * method to find max value given the list
	     */
	    private int findMax(List<Integer> list){
	        int m = Integer.MIN_VALUE;
	        for (int a : list){
	            m = Math.max(a, m);
	        }
	        return m;
	    }

	    /*
	     * method to find bucket index 
	     */
	    private static int hash(int a, int max, int numberOfBuckets) {
	        return (int) ((double) a / max * (numberOfBuckets - 1));
	    }
	}