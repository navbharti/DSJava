package session18.p1;

	public class Rectangle extends GeometricShape{

		private double length;

		private double width;

		Rectangle()

		{

		super();

		System.out.println("Default Constructor - Rectangle");

		this.length = 0.0;

		this.width = 0.0;

		}

		Rectangle(String c, boolean f, double l, double w)

		{

		super(c,f);

		System.out.println("Parameterized Constructor - Rectangle");

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

		String str = String.format("%nRectangle :%nLength :%f%nWidth :"

		+"%f%nBorderColor : %s%nFilled :%b",

		getWidth(), getLength(), getBorderColor(), getFilled());

		return str;

		}
	}