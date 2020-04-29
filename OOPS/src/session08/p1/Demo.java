package session08.p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	Cuboid cube1 = new Cuboid();
	
	System.out.println("Enter the Length, Breadth, Height :");
	
	if(cube1.setDimensions(sc.nextDouble(), sc.nextDouble(),sc.nextDouble())){
	
		System.out.println(cube1);
	
	}
	
	Cuboid cube2 = new Cuboid();
	
	System.out.println("Enter the Length, Breadth, Height(as single value) :");
	
	if(cube2.setDimensions(sc.nextDouble())){
	
		System.out.println(cube2);
	
	}
	
	Cuboid[] cubeArray = new Cuboid[3];
	
	for ( int i=0; i<cubeArray.length; i++){
	
		cubeArray[i]=new Cuboid();
		
		System.out.println("Enter the Length, Breadth, Height as a one value of Cuboid :"+(i+1));
		
		if(cubeArray[i].setDimensions(sc.nextDouble())){
		
			System.out.println("Details of Cuboid :"+(i+1)+" is");
			
			System.out.println(cubeArray[i]);
			
			}
		
		}
	
	}

}