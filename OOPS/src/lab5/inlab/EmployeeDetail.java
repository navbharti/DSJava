package lab5.inlab;

import java.util.Scanner;

public class EmployeeDetail {
	
		private static Employee arr[] = new Employee[50];

		private static Scanner s;

		private static int count;

		private static void initialize()

		{

		s = new Scanner(System.in);

		}

		private static void addEmployee()

		{

		if(count<arr.length)

		{

		System.out.println("Enter Employee ID:");

		String tid = s.nextLine();

		System.out.println("Enter Employee Name:");

		String tna = s.nextLine();

		System.out.println("Enter Employee "

		+ "Department: (marketing/finance/operations/"

		+ "hr/it");

		String tci = s.nextLine();

		Employee st = new Employee();

		if(st.setEmployee(tid,tna,tci))

		{

		arr[count++]=st;

		}

		}

		else

		System.out.println("Cannot create Student");

		}

		private static void modifyEmployeeID()

		{

		System.out.println("Enter Employee ID");

		int tid = Integer.parseInt(s.nextLine());

		for(int i=0;i<count;i++)

		{

		System.out.println(i);

		if(arr[i].getID() == tid)

		{

		System.out.println(arr[i]);

		break;

		}

		}

		}

		private static int menuSelection()

		{

		System.out.println("Empolyee Database");

		System.out.println("1. Create an New "

		+ "Employee record");

		System.out.println("2. Update name based on ID");

		System.out.println("3. Print All Employees");

		System.out.println("4. Print Department "

		+ "Specific employees");

		System.out.println("5. Exit of the "

		+ "Employee Records");

		System.out.println("Enter U r choice");

		String str = s.nextLine();

		int r = Integer.parseInt(str);

		return r;

		}

		private static void displayDepartWiseEmployee()

		{

		System.out.println("Enter Department name :");

		String depart = s.nextLine();

		for(int i=0;i<count;i++)

		{

		System.out.println(i);

		if(arr[i].getDepartment().equals(depart))

		{

		System.out.println(arr[i]);

		break;

		}

		}

		}

		private static void displayAllEmployee()

		{

		System.out.println("All Employee Details");

		for(int i=0;i<count;i++)

		{

		System.out.println(arr[i]);

		}

		}

		public static void main(String[] args)

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

		addEmployee();

		break;

		case 2:

		modifyEmployeeID();

		break;

		case 3:

		System.out.println(count);

		displayAllEmployee();

		break;

		case 4:

		displayDepartWiseEmployee();

		break;

		default:

		repeat=false;

		}

		}

		}

		}