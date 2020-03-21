package codechefMarch2020;

import java.io.IOException;
import java.util.Scanner;

public class CHPINTU2 {

	public static void main(String[] args) throws IOException {

		//create Scanner object
		Scanner input = new Scanner(System.in);
		//read test value
		int testCases=0;
		if(input.hasNext())
			 testCases= input.nextInt();

		while(testCases>0) {
			
			//for each test case read n and m
			
			int n=Integer.parseInt(input.next());//input.nextInt();
			int m=Integer.parseInt(input.next());//input.nextInt();
			
			//for each test case create two array with size n each
			int fruits[] = new int[n];
			int price[] = new int[n];
			
			//read all the elements in first array
			for(int i=0; i<n; i++)
				fruits[i]=Integer.parseInt(input.next());//input.nextInt();
			

			for(int i=0; i<n; i++)
				price[i]=Integer.parseInt(input.next());//input.nextInt();
				
			int min=Integer.MAX_VALUE;
			int sum = 0;

			for(int i=0; i<n; i++) {

				 sum = 0;
				for(int j=0; j<n; j++) {
					if(fruits[i]==fruits[j])
						sum+=price[j];
				}
				
				if(min>sum)
					min = sum;
			}
			
			System.out.println(min);
			
			testCases--;
		}//while close
		
		input.close();
	}

}
