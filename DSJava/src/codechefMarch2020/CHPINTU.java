package codechefMarch2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class CHPINTU {

	public static void main(String[] args) {
		//create map with key as Integer and value as Integer
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		//create Scanner object
		Scanner input = new Scanner(System.in);
		
		//read test value
		int testCases = input.nextInt();
		
		//repeat all the test cases
		while(testCases>0) {
			
			//for each test case read n and m
			int n=input.nextInt();
			int m=input.nextInt();
			
			//for each test case create two array with size n each
			int fruits[] = new int[n];
			int price[] = new int[n];
			
			//read all the elements in first array
			for(int i=0; i<n; i++)
				fruits[i]=input.nextInt();
			
			//read all the elements in second array
			for(int i=0; i<n; i++)
				price[i]=input.nextInt();
			
			//create map using first array elements as keys and second array elements as associated values
			//put the values as the sum total for each key
			
			
			//sort the values data of map in ascending order
			
			
			//print the first element which is the lowest price required to purchase one type of fruit
			
			
			testCases--;
		}//while close
	}

}
