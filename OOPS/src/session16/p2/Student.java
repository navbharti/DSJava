package session16.p2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class Student {

private String id;

private String name;

private Date dob;

private String gender;

private int marks [] = new int[6];

public boolean setDOB(String str)

{

StringTokenizer st = new StringTokenizer(str,"/");

int dateint[] = new int[3];

int i=0;

while (st.hasMoreTokens())

dateint[i++]=Integer.parseInt(st.nextToken());

if((dateint[0]>=1 || dateint[0]<=31)&&(dateint[1]>=1 || dateint[1]<=12) && (dateint[2]<=2002))

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

public boolean setMarks(int m[])

{

for(int i=0;i<6;i++)

{

if(m[i]>=0 && m[i]<=100)

continue;

else

return false;

}

return true;

}

public boolean setStudent(String i,String n,String d, String g, String m)throws Exception

{

StringTokenizer st = new StringTokenizer(m," ");

int tmark[] = new int[6];

int iter=0;

while (st.hasMoreTokens())

tmark[iter++]=Integer.parseInt(st.nextToken());

if(setID(i) && setName(n) && setDOB(d) && setGender(g)&&setMarks(tmark))

{

this.name=n;

this.id=i;

this.gender=g;

this.dob = new SimpleDateFormat("dd/MM/yyyy").parse(d);

for(int ia=0;ia<6;ia++)

this.marks[ia] = tmark[ia];

return true;

}

return false;

}

private String getID()

{

return this.id;

}

private String getGender()

{

return this.gender;

}

private String getName()

{

return this.name;

}

private Date getDOB()

{

return this.dob;

}

private int [] getMarks()

{

return this.marks;

}

public String toString()

{

int m[] = getMarks();

int total = m[0]+m[1]+m[2]+m[3]+m[4]+m[5];

float avg = total/6;

String str = String.format("%nStudent Information Management System "

+ ":%nStudent ID : %s %nStudent Name : "

+ "%s %nStudent DOB : %s %n"

+ "Student Gender : %s %n"

+ "Total : %d %n"

+ "Average : %f %n", getID(),getName(),getDOB(),getGender(),total,avg);

return str;

}

}