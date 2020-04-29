package session16.p1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Student {

		private String id;

		private String name;

		private Date dob;

		private String gender;

		public boolean setDOB(String str)

		{

		StringTokenizer st = new StringTokenizer(str,"/");

		int dateint[] = new int[3];

		int i=0;

		while (st.hasMoreTokens())

		dateint[i++]=Integer.parseInt(st.nextToken());

		if((dateint[0]>=1 || dateint[0]<=31)&&

		(dateint[1]>=1 || dateint[1]<=12) &&

		(dateint[2]<=2002))

		return true;

		return false;

		}

		public boolean setID(String str)

		{

		char[] ch = new char[2];

		ch[0] = str.charAt(0);

		ch[1] = str.charAt(1);

		String str1 = new String(ch);

		int r = Integer.parseInt(str1);

		int len = str.length();

		if(r>=16 && r<=19 && len ==9)

		return true;

		else

		return false;

		}

		public boolean setGender(String str)

		{

		str = str.toLowerCase();

		if(str.equals("male") || str.equals("female"))

		return true;

		else

		return false;

		}

		public boolean setName(String str)

		{

		if(str==null || str.isEmpty() || str.equals(" "))

		return false;

		else

		return true;

		}

		public boolean setStudent(String i,String n,String d, String g)throws Exception

		{

		if(setID(i) && setName(n) && setDOB(d) && setGender(g))

		{

		this.name=n;

		this.id=i;

		this.gender=g;

		this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(d);

		return true;

		}

		return false;

		}

		private String getID()

		{

		return id;

		}

		private String getGender()

		{

		return gender;

		}

		private String getName()

		{

		return name;

		}

		private Date getDOB()

		{

		return dob;

		}

		public String toString()

		{

		String str = String.format("Student ID : %s "

		+ "%nStudent Name : %s %nStudent City : %s %n"

		+ "Student PostCode : %s %n", getID(),getName(),getDOB(),getGender());

		return str;

		}

		}