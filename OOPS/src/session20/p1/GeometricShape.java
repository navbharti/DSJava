package session20.p1;

public class GeometricShape {
	
	private String borderColor;

	private Boolean filled;

	GeometricShape()

	{

	this.borderColor = "black";

	this.filled = false;

	}

	GeometricShape(String c,boolean f)

	{

	this.borderColor = c;

	this.filled = f;

	}

	public String getBorderColor()

	{

	return this.borderColor;

	}

	public Boolean getFilled()

	{

	return this.filled;

	}

	public double area()

	{

	return 0.0;

	}

	}