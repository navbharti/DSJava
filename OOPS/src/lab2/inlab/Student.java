package lab2.inlab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Student class
 */
public class Student{

	/*
	 * Student class Attributes
	 */
	private String name;
	private String id;
	private String gender;
	private String department;
	
	/*
	 * main method
	 */
	public static void main(String[] args){
		
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.setStudent("190030001", "arunkumar", "M", "CSE");
		st2.setStudent("190030002", "nareshkumar", "M", "ECE");
		
		System.out.println(st1);
		System.out.println(st2);
	
	}	
	
	/*
	 * Getters and Setter
	 */
	public String getName(){
		return this.name;
	
	}
	
	public String getID(){
		return this.id;
	
	}
	
	public String getGender(){
		return this.gender;
	
	}
	
	public String getDepartment(){
		return this.department;
	
	}
	
	/*
	 * Getter method for Student
	 */
	public boolean setStudent(String i,String n,String g, String d){
		int il = i.length();
	
		if(il==9 && testGender(g) && testDepartment(d) && testName(n)){
			this.id=i;
			this.name=n;
			this.gender=g;
			this.department=d;
			
			return true;
		
		}
		
		return false;
	
	}
	
	public boolean testGender(String g){
		if(g.equals("M") || g.equals("F")){
			return true;
			
		}
		else{
	
			return false;
	
		}
	
	}
	
	public boolean testDepartment(String d){
		
		if(d.equals("BT") || d.equals("CE") ||d.equals("CSE") ||d.equals("ECE") ||d.equals("EEE") ||d.equals("ECS") ||d.equals("ME") ||d.equals("PE")){
		
			return true;
		
		}
		else{
		
			return false;
		
		}
	
	}
	
	public boolean testName(String s){
	
		Pattern p = Pattern.compile("[^A-Za-z]");
		Matcher m = p.matcher(s);
		boolean b = m.find();
		
		if (!b){
			return true;
		
		}
		
		else{
		
			return false;
		
		}
	
	}
	/*
	 * toString() method implementation
	 */
	public String toString(){
	
	String str = String.format("Student ID : %s %nStudent Name : %s %nStudent Gender : %s %nStudent Department : %s %n", getID(), getName(), getGender(), getDepartment());
	
		return str;
	
	}

}