package session07.p1;

import java.util.Scanner;

public class Demo {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	Cuboid cube = new Cuboid();
	
	System.out.println("Enter the Length, Breadth, Height :");
	
	if(cube.setL(sc.nextDouble())&&cube.setB(sc.nextDouble())&&cube.setH(sc.nextDouble()))
	
	{
	
		System.out.println(cube);
	
	}
	
	}

}