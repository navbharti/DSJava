package session10.p1;

public class Demo {

public static void main(String[] args)

{

System.out.println("Default Constructor");

Cuboid cube1 = new Cuboid();

System.out.println(cube1);

System.out.println("Single Parameter Constructor");

Cuboid cube2 = new Cuboid(10.0);

System.out.println(cube2);

System.out.println("Three Parameter Constructor");

Cuboid cube3 = new Cuboid(10.0,20.0,30.0);

System.out.println(cube3);

System.out.println("Copy Constructor");

Cuboid cube4 = new Cuboid(cube3);

System.out.println(cube4);

}

}