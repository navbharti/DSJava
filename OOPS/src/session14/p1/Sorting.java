package session14.p1;

public class Sorting {

		String names[];

		int n;

		Sorting(int n)

		{

		names =new String[n];

		this.n=n;

		}

		private void setArray(String a[])

		{

		for (int i = 0; i < a.length; i++)

		{

		this.names[i] = a[i];

		}

		}

		private void toSort()

		{

		String temp;

		for (int i = 0; i < n; i++)

		{

		for (int j = i + 1; j < n; j++)

		{

		if (names[i].compareTo(names[j])>0)

		{

		temp = names[i];

		names[i] = names[j];

		names[j] = temp;

		}

		}

		}

		}

		private void display()

		{

		System.out.print("Names in Sorted Order:");

		for (int i = 0; i < n - 1; i++)

		{

		System.out.print(names[i] + ",");

		}

		System.out.print(names[n - 1]);

		}

		public static void main(String[] a)

		{

		Sorting sort=new Sorting(a.length);

		sort.setArray(a);

		sort.toSort();

		sort.display();

		}

		}