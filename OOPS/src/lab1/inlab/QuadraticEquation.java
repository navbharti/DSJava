package lab1.inlab;
//InLab 2.1

import java.lang.Math;

public class QuadraticEquation{
	//Data members
	private int a;
	private int b;
	private int c;

	//parameterized constructor
	QuadraticEquation(int a, int b, int c)
		{
		this.a=a;
		this.b=b;
		this.c=c;
		}

	private int getA()
		{
		return a;
		}

	private int getB()
	
		{
		
		return b;
		
		}

	private int getC()
	
		{
		
		return c;
		
		}
	
	public float getDiscriminant()
	
		{
		
		return ((getB()*getB()) - (4 * getA()*getC()));
		
		}
	
	public float getRoot1()
	
		{
		
		float d = getDiscriminant();
		
		float sq = (float)Math.sqrt(d);
		
		if(d>0)
		
			return ((-this.b + sq)/(2*this.a));
		
		else if(d<0)
		
			return (-this.b / (2 *this.a));
		
		else
		
			return ( -this.b / (2 * this.a));
		
		}
	
	public float getRoot2()
	
	{
	
	float d = getDiscriminant();
	
	float sq = (float)Math.sqrt(d);
	
	if(d>0)
	
		return ((-this.b - sq)/(2*this.a));
	
	else if(d<0)
	
	{
	
		float sq1 = (float)Math.sqrt(-(d));
		
		return (sq1 / (2 * this.a));
	
	}
	
	else
	
		return ( -this.b / (2 * this.a));
	
	}
	
	public static void main(String[] args)
	
	{
	
		QuadraticEquation obj1 = new QuadraticEquation(1,-3,10);
		
		float d = obj1.getDiscriminant();
		
		float r1 = obj1.getRoot1();
		
		float r2 = obj1.getRoot2();
		
		if(d>0)
		
			{
			
			System.out.println("real and unequal");
			
			System.out.println("Roots are R1 : "+r1+" R2 : "+r2);
			
			}
		
		else if(d<0)
		
			{
			
			System.out.println("imaginary");
			
			System.out.println("Roots are R1 : "+r1+" R2 : i "+r2);
			
			}
		
		else
		
			{
			
			System.out.println("real and equal");
			
			System.out.println("Roots are R1 : "+r1+" R2 : "+r2);
			
			}
	
	}

}