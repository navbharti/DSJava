package DS.sortingSearching.sorting.bucketsort;

import java.util.ArrayList;
import java.util.List;

public class Bucket {
	public static void main(String args[]) {
		List <Integer> list = new ArrayList<>();
		int arr[]= {77, 46, 6 ,65, 17, 85, 19, 64, 47, 52, 17};
		for(int a: arr)
			list.add(a);
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
	}

	public static int findMax(List<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int a: list)
			max=Math.max(max, a);
		return max;
	}
	
	public static int hash(int a, int max, int bucketSize) {
		return (int)(double)a/max*bucketSize;
	}
	
	public static List<List<Integer>> splitIntoBuckets(List<Integer> list, List<List<Integer>> buckets){
		int max=findMax(list);
		for(int a: list) {
			int bIndex = hash(a, max, buckets.size()-1);
			buckets.get(bIndex).add(a);
		}
		return buckets;
	}
	
	public static List<Integer> concatenateBuckets(List<List<Integer>> buckets) {
		List<Integer> sortedList = new ArrayList<Integer>();
		for(List<Integer> bucket: buckets)
			sortedList.addAll(bucket);
		return sortedList;
	}
	
	//public static List<Integer> 
}
