package session10.p1;

public class DefCons

{

private int i;

private float f;

private double d;

private char c;

private boolean b;

private String s;

public static void main(String[] args)

{

System.out.println("Default Constructor");

DefCons dc = new DefCons();

dc.show();

}

public void show()

{

System.out.println("Integer :"+i);

System.out.println("Float :"+f);

System.out.println("Double :"+d);

System.out.println("Character :"+c);

System.out.println("Boolean :"+b);

System.out.println("String :"+s);

}

}