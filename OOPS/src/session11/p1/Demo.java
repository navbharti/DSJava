package session11.p1;

public class Demo {

public static void main(String[] args) {

Cuboid cube1 = new Cuboid();

System.out.println(cube1);

Cuboid cube2 = new Cuboid(10.0);

System.out.println(cube2);

Cuboid cube3 = new Cuboid(10.0,11.0,12.0);

System.out.println(cube3);

Cuboid cube4 = new Cuboid(cube3);

System.out.println(cube4);

}

}