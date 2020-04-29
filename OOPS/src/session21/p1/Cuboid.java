package session21.p1;

import java.util.Scanner;

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

/*

public double area()

{

System.out.println("Cuboid Area");

return this.getWidth() * this.getLength() * this.getHeight();

}

*/

public double area()

{

System.out.println("Cuboid Area");

return ((2*this.getHeight()*this.getLength())+(2*this.getHeight()*this.getWidth())+(2*this.getWidth()*this.getLength()));

}

public static void main(String[] args)

{

GeometricShape obj1;

Scanner sc = new Scanner(System.in);

while(true)

{

System.out.println("1. Rectangle Class");

System.out.println("2. Cuboid Class");

System.out.println("3. Exit");

int ch = sc.nextInt();

switch(ch)

{

case 1:

obj1 = new Rectangle("yellow", true, 10.05, 12.34);

System.out.println("Border Color :"+obj1.getBorderColor());

System.out.println("Filled :"+obj1.getFilled());

System.out.println("Area :"+obj1.area());

// Error

// System.out.println("Length :"+obj1.getLength());

// System.out.println("Breadth :"+obj1.getWidth());

Rectangle obj2 = (Rectangle)obj1;

System.out.println("Length :"+obj2.getLength());

System.out.println("Breadth :"+obj2.getWidth());

System.out.println("Area :"+obj2.area());

break;

case 2:

obj1 = new Cuboid("yellow", true, 10.05, 12.34,13.45);

System.out.println("Border Color :"+obj1.getBorderColor());

System.out.println("Filled :"+obj1.getFilled());

System.out.println("Area :"+obj1.area());

// Error

// System.out.println("Length :"+obj1.getLength());

// System.out.println("Breadth :"+obj1.getWidth());

// System.out.println("Height :"+obj1.getHeight());

Cuboid obj3 = (Cuboid)obj1;

System.out.println("Length :"+obj3.getLength());

System.out.println("Breadth :"+obj3.getWidth());

System.out.println("Height :"+obj3.getHeight());

System.out.println("Area :"+obj3.area());

break;

case 3:

System.exit(0);

}

System.out.println();

}

}

}