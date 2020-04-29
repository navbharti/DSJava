package session06.p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortingParagraph {

		private static String str[] = new String[200];

		private static Scanner sc;

		private static int count;

		public static void init()

		throws FileNotFoundException

		{

		File f1 = new File("File1.txt");

		sc= new Scanner(f1);

		count = 0;

		while(sc.hasNext())

		{

		str[count++]=sc.next();

		}

		sc.close();

		}

		public static void bubbleSort()

		{

		String temp;

		for (int j = 0; j < count; j++)

		{

		for (int i = j + 1; i < count;

		i++)

		{

		// comparing adjacent strings

		if (str[i].compareTo

		(str[j]) < 0)

		{

		temp = str[j];

		str[j] = str[i];

		str[i] = temp;

		}

		}

		}

		}

		public static void display()

		{

		for (int j = 0; j < count; j++)

		{

		System.out.println(str[j]);

		}

		}

		public static void main(String[] args)

		throws FileNotFoundException

		{

		init();

		bubbleSort();

		display();

		}

		}