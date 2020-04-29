package session18.p2;

	public class Cuboid extends Rectangle

	{

	private double height;

	Cuboid()

	{

	super();

	this.height = 0.0;

	}

	Cuboid(String c, boolean f, double l, double w, double h)

	{

	super(c,f,l,w);

	this.height = w;

	}

	public double getHeight()

	{

	return this.height;

	}

	public String toString()

	{

	String str = String.format("%nCuboid :%nLength :%f%nWidth :"

	+ "%f%nHeight :"

	+"%f%nBorderColor : %s%nFilled :%b",

	getWidth(), getLength(), getHeight(), getBorderColor(), getFilled());

	return str;

	}

	public static void main(String[] args)

	{

	System.out.println("Multilevel Inheritance");

	Cuboid cube1 = new Cuboid();

	System.out.println(cube1);

	System.out.println();

	Cuboid cube2 = new Cuboid("red",true,10,22,13);

	System.out.println(cube2);

	}

	}