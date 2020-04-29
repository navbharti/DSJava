package session18.p3;

	public class Rectangle extends GeometricShape{

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

		public String toString()

		{

		String str = String.format("%nRectangle :%nLength :%f%n"

		+ "Width :"

		+ "%f%nBorderColor : %s%nFilled :%b",

		getLength(), getWidth(), getBorderColor(), getFilled());

		return str;

		}

		}