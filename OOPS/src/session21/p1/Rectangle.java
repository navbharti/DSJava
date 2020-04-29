package session21.p1;

	public class Rectangle extends GeometricShape

	{

	private double length;

	private double width;

	Rectangle()

	{

	super();

	this.length = 0.0;

	this.width = 0.0;

	}

	Rectangle(String c, boolean f, double l, double w)

	{

	super(c,f);

	this.length = l;

	this.width = w;

	}

	public double getWidth()

	{

	return this.width;

	}

	public double getLength()

	{

	return this.length;

	}

	public double area()

	{

	System.out.println("Rectangle Area");

	return this.getWidth()*this.getLength();

	}

	}