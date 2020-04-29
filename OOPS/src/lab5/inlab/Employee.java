package lab5.inlab;

public class Employee{

	private int id;

	private String name;

	private String department;

	Employee()

	{

	this.id=0;

	this.name="#";

	this.department="#";

	}

	Employee(int i,String n,String d)

	{

	if(setID(i))

	this.id=i;

	else

	this.id=0;

	if(setName(n))

	this.name=n;

	else

	this.name="#";

	if(setDepartment(d))

	this.department=d;

	else

	this.department="#";

	}

	public int getID()

	{

	return this.id;

	}

	private String getName()

	{

	return this.name;

	}

	public String getDepartment()

	{

	return this.department;

	}

	public boolean validateString(String str)

	{

	str = str.toLowerCase();

	char[] charArray = str.toCharArray();

	for (int i = 0; i < charArray.length; i++)

	{

	char ch = charArray[i];

	if (!(ch >= 'a' && ch <= 'z'))

	{

	return false;

	}

	}

	return true;

	}

	private boolean setName(String s)

	{

	if(validateString(s))

	{

	this.name=s;

	return true;

	}

	return false;

	}

	private boolean setDepartment(String d)

	{

	if(validateString(d)&&

	(d.equals("marketing")||

	d.equals("finance")||

	d.equals("operations")||

	d.equals("hr")||

	d.equals("it")))

	{

	this.department=d;

	return true;

	}

	return false;

	}

	public boolean setEmployee(String id,

	String tna,String td)

	{

	int tid = Integer.parseInt(id);

	if(setID(tid)&&setName(tna)&&setDepartment(td))

	{

	this.name=tna;

	this.id=tid;

	this.department=td;

	return true;

	}

	return false;

	}

	private boolean setID(int i)

	{

	if(i>0)

	{

	this.id=i;

	return true;

	}

	return false;

	}

	public String toString()

	{

	return String.format("%nEmployee Details:%n"

	+ "Employee ID : %d%nEmployee Name : "

	+ "%s%n"

	+ "Employee Department : %s", getID(),

	getName(),getDepartment());

	}

	}