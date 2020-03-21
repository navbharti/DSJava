package codechefMarch2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CHPINTU {

	public static void main(String[] args) throws IOException {
		//create map with key as Integer and value as Integer
		LinkedHashMap<Long, Long> map = new LinkedHashMap<Long, Long>();
		
		//create Scanner object
		Scanner input = new Scanner(System.in);
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		//read test value
		long testCases=0;
		if(input.hasNext())
			 testCases= input.nextInt();
		//int testCases = br.read();
		//repeat all the test cases
		while(testCases>0) {
			
			//for each test case read n and m
			
			long n=Integer.parseInt(input.next());//input.nextInt();
			//int n = br.read();
			long m=Integer.parseInt(input.next());//input.nextInt();
			//int m = br.read();
			
			//for each test case create two array with size n each
			long fruits[] = new long[(int)n];
			long price[] = new long[(int)n];
			
			//read all the elements in first array
			for(long i=0; i<n; i++)
				fruits[(int)i]=Integer.parseInt(input.next());//input.nextInt();
				//fruits[i]=br.read();
			
			//read all the elements in second array
			for(long i=0; i<n; i++)
				price[(int)i]=Integer.parseInt(input.next());//input.nextInt();
				//price[i]=br.read();
			
			//create map using first array elements as keys and second array elements as associated values
			//put the values as the sum total for each key
			for(long i=0; i<n; i++) {
				if(map.containsKey(fruits[(int)i]))
					map.put(fruits[(int)i], map.get(fruits[(int)i])+price[(int)i]);
				else
					map.put(fruits[(int)i], price[(int)i]);
			}
				
			//System.out.println(map.keySet());
			//System.out.println(map.values());
			Long min=50000l;
			for(Long a: map.values()) {
				if(min>a)
					min=a;
			}
			
			System.out.println(min);
			//sort the values data of map in ascending order
			
			
			//print the first element which is the lowest price required to purchase one type of fruit
			
			
			testCases--;
		}//while close
	}

}
