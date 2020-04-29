package session10.p1;

public class Temp {

Temp()

{

this(5);

System.out.println("The Default constructor");

}

Temp(int x)

{

this(5, 15);

System.out.println("Single Parameter constructor");

}

Temp(int x, int y)

{

System.out.println("Double Parameter constructor");

}

public static void main(String args[])

{

new Temp();

}

}