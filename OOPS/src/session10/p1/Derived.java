package session10.p1;

public class Derived extends Base

{

Derived()

{

System.out.println("No-argument constructor " +

"of derived");

}

Derived(String name)

{

super(name);

System.out.println("Calling parameterized "

+ "constructor of derived");

}

public static void main(String[] args)

{

Derived obj1 = new Derived("test");

System.out.println();

Derived obj2 = new Derived();

}

}