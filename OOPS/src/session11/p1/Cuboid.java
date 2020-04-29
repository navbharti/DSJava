package session11.p1;

public class Cuboid {

private double length;

private double breadth;

private double height;

Cuboid()

{

this.length = 0.0;

this.breadth = 0.0;

this.height = 0.0;

}

Cuboid(double lbd)

{

this.length = lbd;

this.breadth = lbd;

this.height = lbd;

}

Cuboid(double l, double b, double d)

{

this.length = l;

this.breadth = b;

this.height = d;

}

Cuboid(Cuboid c)

{

this.length = c.length;

this.breadth = c.breadth;

this.height = c.height;

}

public double volume()

{

return length*breadth*height;

}

public String getH()

{

return String.format("%f m", this.height);

}

public String getL()

{

return String.format("%f m", this.length);

}

public String getB()

{

return String.format("%f m", this.breadth);

}

public String toString()

{

String str = String.format("%nLength :%s%nBreadth :"

+"%s%nHeight : %s%nVolume :%f cu.m%n%n",

getL(),getB(),getH(),volume());

return str;

}

}