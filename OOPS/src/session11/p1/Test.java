package session11.p1;

public class Test

{

Test()

{

this(5);

System.out.println("The Default constructor");

}

Test(int x)

{

this(5, 15);

System.out.println(x);

}

Test(int x, int y)

{

System.out.println(x * y);

}

public static void main(String args[])

{

new Test();

}

}