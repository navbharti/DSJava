package session10.p1;

public class ParaCons {

private int i;

private float f;

private double d;

private char c;

private boolean b;

private String s;

ParaCons(String s)

{

this.i=10;

this.f=11;

this.d=12;

this.c='c';

this.b=true;

this.s=s;

}

public static void main(String[] args)

{

System.out.println("Parametersied Constructor");

ParaCons pc = new ParaCons("parameter");

pc.show();

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