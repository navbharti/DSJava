package session20.p1;

	public class Cuboid extends Rectangle

	{

	private double height;

	Cuboid()

	{

	super();

	this.height = 0.0;

	}

	Cuboid(String c, boolean f, double l,

	double w, double h)

	{

	super(c,f,l,w);

	this.height = h;

	}

	public double getHeight()

	{

	return this.height;

	}

	public String toString()

	{

	String str = String.format("%nCuboid "

	+ ":%nLength :%f%nWidth :"

	+ "%f%nHeight :"

	+"%f%nBorderColor : %s%nFilled "

	+ ":%b",

	getWidth(), getLength(),

	getHeight(), getBorderColor(),

	getFilled());

	return str;

	}

	public double area()

	{

	return ((2*this.getHeight()*this.getLength())+(2*this.getHeight()*this.getWidth())+(2*this.getWidth()*this.getLength()));

	}

	public static void main(String[] args)

	{

	GeometricShape obj1 = new GeometricShape();

	System.out.println("Super Class Area - GeometricShape");

	System.out.println(obj1.area());

	System.out.println();

	obj1 = new Rectangle("red",true,10,20);

	System.out.println("Super Class Area - Rectangle");

	System.out.println(obj1.area());

	System.out.println();

	obj1 = new Cuboid("yellow",true,10,20,30);

	System.out.println("Sub Class Area - Cuboid");

	System.out.println(obj1.area());

	System.out.println();

	}

	}