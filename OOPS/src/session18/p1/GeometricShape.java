package session18.p1;

public class GeometricShape {
	private String borderColor;

	private Boolean filled;

	GeometricShape()

	{

	System.out.println("Default Constructor - Geometric Shape");

	this.borderColor = "black";

	this.filled = false;

	}

	GeometricShape(String c, boolean f)

	{

	System.out.println("Parameterized Constructor - Geometric Shape");

	this.borderColor = c;

	this.filled = f;

	}

	/*public void setValues(String bg, Boolean f)

	{

	this.borderColor = bg;

	this.filled = f;

	}*/

	public String getBorderColor()

	{

	return this.borderColor;

	}

	public Boolean getFilled()

	{

	return this.filled;

	}

	}

	