
/**
 * Data Structure through Java
 * Author: Dr. Naveen Kumar
 * Assistant Professor
 * KL University, CSE
 * 24-Feb-2020 10:55:40 pm
 * User: navbharti 
 * Class: LinearSearchConsole
 */
package searching;

import java.util.Scanner;

/**
 * @author navbharti
 *
 */
public class LinearSearchConsole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the search key: ");
		int key = input.nextInt();
		int position = linearSearch(arr, n, key);
		if(position==-1)
			System.out.println("Data not found!!!");
		else
			System.out.println("Data is found at Position: "+position);
	
		input.close();
	}
	
	public static int linearSearch(int arr[], int n, int key) {
		for(int i=0; i<n; i++)
			if(arr[i]==key)
				return i+1;
		return -1;
	}

}
