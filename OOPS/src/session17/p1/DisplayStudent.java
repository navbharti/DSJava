package session17.p1;

import java.util.Scanner;

public class DisplayStudent {
	private static Student arr[] = new Student[10];

	private static int count=0;

	private static Scanner s;

	private static void initialize()

	{

	s = new Scanner(System.in);

	}

	private static int menuSelection()

	{

	System.out.println("Student Database");

	System.out.println("1. Add a Student to the Database");

	System.out.println("2. Display all Student detail");

	System.out.println("3. Search a student based on ID");

	System.out.println("4. Search based on name");

	System.out.println("5. Modify name based on ID");

	System.out.println("6. Sort based on ID");

	System.out.println("7. Sort based on total");

	System.out.println("8. Exit of the Student Database");

	System.out.println("Enter U r choice");

	String str = s.nextLine();

	int r = Integer.parseInt(str);

	return r;

	}

	private static void addStudent() throws Exception

	{

	if(count<arr.length)

	{

	System.out.println("Enter Student ID:");

	String tid = s.nextLine();

	System.out.println("Enter Student name:");

	String tna = s.nextLine();

	System.out.println("Enter Student Date of Birth (dd/MM/yyyy):");

	String tdob = s.nextLine();

	System.out.println("Enter Student gender (male/female):");

	String tpc = s.nextLine();

	System.out.println("Enter Student 6 Subject Marks (Single Line):");

	String tmarks = s.nextLine();

	Student st = new Student();

	if(st.setStudent(tid,tna,tdob,tpc,tmarks))

	{

	arr[count++]=st;

	System.out.println("Students Details is added succesfully");

	}

	else

	System.out.println("Students Details is not added succesfully");

	}

	else

	System.out.println("Cannot create Student");

	}

	private static void displayStudentAll()

	{

	for(int i=0;i<count;i++)

	{

	System.out.println(arr[i]);

	}

	}

	private static void search(String stu)

	{

	for(int i=0;i<count;i++)

	{

	System.out.println(i);

	if(arr[i].getID().equals("KLU"+stu))

	{

	System.out.println(arr[i]);

	break;

	}

	}

	}

	private static void search()

	{

	System.out.println("Enter Student Name");

	String stu = s.nextLine();

	for(int i=0;i<count;i++)

	{

	System.out.println(i);

	if(arr[i].getName().equals(stu))

	{

	System.out.println(arr[i]);

	break;

	}

	}

	}

	private static void modify()

	{

	System.out.println("Enter Student ID");

	String stu = s.nextLine();

	for(int i=0;i<count;i++)

	{

	if(arr[i].getID().equals(stu))

	{

	System.out.println("Enter Student Name");

	String na = s.nextLine();

	arr[i].modifyName(na);

	System.out.println(arr[i]);

	break;

	}

	}

	}

	private static void sort(String st)

	{

	Student temp = null;

	for (int i = 0; i < count; i++)

	{

	for (int j = i + 1; j < count; j++)

	{

	if (arr[i].getID().compareTo(arr[j].getID())>0)

	{

	temp = arr[i];

	arr[i] = arr[j];

	arr[j] = temp;

	}

	}

	}

	}

	private static void sort()

	{

	Student temp;

	for (int i = 0; i < count; i++)

	{

	for (int j = i + 1; j < count; j++)

	{

	if (arr[i].getTotal() >arr[j].getTotal())

	{

	temp = arr[i];

	arr[i] = arr[j];

	arr[j] = temp;

	}

	}

	}

	}

	public static void main(String []args) throws Exception

	{

	boolean repeat = true;

	int choice;

	initialize();

	while(repeat)

	{

	choice=menuSelection();

	switch(choice)

	{

	case 1:

	addStudent();

	break;

	case 2:

	displayStudentAll();

	break;

	case 3:

	System.out.println("Enter Student ID");

	String stu = s.nextLine();

	search(stu);

	break;

	case 4:

	search();

	break;

	case 5:

	modify();

	break;

	case 6:

	sort("ID");

	displayStudentAll();

	break;

	case 7:

	sort();

	displayStudentAll();

	break;

	default:

	repeat=false;

	}

	}

	// addStudent();

	// menuSelection();

	// System.out.println(arr[0]);

	}

	}