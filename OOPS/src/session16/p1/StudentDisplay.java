package session16.p1;

import java.util.Scanner;

public class StudentDisplay {

		private static Student arr[] = new Student[3];

		private static int count=0;

		private static Scanner s = new Scanner(System.in);

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

		Student st = new Student();

		if(st.setStudent(tid,tna,tdob,tpc))

		{

		// System.out.println("hello");

		arr[count++]=st;

		System.out.println("Students Details is added succesfully");

		}

		else

		System.out.println("Students Details is not added succesfully");

		}

		else

		System.out.println("Cannot create Student");

		}

		public static void main(String []args) throws Exception {

		addStudent();

		System.out.println(arr[0]);

		}

		}