package session18.p3;

public class Circle extends GeometricShape{

private double radius;

Circle()

{

super();

this.radius = 0.0;

}

Circle(String c, boolean f, double r)

{

super(c,f);

this.radius = r;

}

public double getRadius()

{

return this.radius;

}

public String toString()

{

String str = String.format("%nCircle :%nRadius :"

+"%f%nBorderColor : %s%nFilled :%b",

getRadius(), getBorderColor(), getFilled());

return str;

}

}