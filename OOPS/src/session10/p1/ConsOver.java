package session10.p1;

public class ConsOver

{

ConsOver()

{

System.out.println("Default Constructor");

}

ConsOver(String s)

{

System.out.println(s);

}

ConsOver(String s,int i)

{

System.out.println(s);

}

ConsOver(String s,int i,char c)

{

System.out.println(s);

}

public static void main(String[] args)

{

System.out.println("Constructor Overloading");

ConsOver co1 = new ConsOver();

ConsOver co2 = new ConsOver("Single Parameter");

ConsOver co3 = new ConsOver("Double Parameter",10);

ConsOver co4 = new ConsOver("Triple Parameter",10,'c');

}

}