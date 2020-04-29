package session10.p1;

class Base

{

String name;

Base()

{

this("");

System.out.println("No-argument constructor of" +

" base class");

}

Base(String name)

{

this.name = name;

System.out.println("Calling parameterized constructor"

+ " of base");

}

}

