package session08.p1;

/*
 * Cuboid class
 */
public class Cuboid {

	/*
	 * Cuboid class attributes
	 */
	private double length;
	private double breadth;
	private double height;

	public double volume(){
	
		return length*breadth*height;
	
	}
	
	public boolean setL(double l){
	
		if(l>0){
			this.length = l;
			return true;
		
		}
	
	return false;
	
	}
	
	public boolean setB(double b){
	
		if(b>0){
			this.breadth = b;
			return true;
		
		}
	
	return false;
	
	}
	
	public boolean setH(double h){
		
		if(h>0){
			
			this.height = h;
			return true;
			
		}
	
	return false;
	
	}
	
	public String getH(){
	
		return String.format("%f m", this.height);
	
	}
	
	public String getL(){
	
		return String.format("%f m", this.length);
	
	}
	
	public String getB(){
	
		return String.format("%f m", this.breadth);
	
	}
	
	public boolean setDimensions(double l, double b, double h){
	
		if(setL(l)&&setB(b)&&setH(h)){
		
			return true;
		
		}
	
	return false;
	
	}
	
	public boolean setDimensions(double lbh){
	
		if(setL(lbh)&&setB(lbh)&&setH(lbh)){
		
			return true;
		
		}
	
	return false;
	
	}
	
	public String toString(){
	
		String str = String.format("Length :%s%nBreadth :"
		
		+"%s%nHeight : %s%nVolume :%f cu.m",
		
		getL(),getB(),getH(),volume());
		
		return str;
	
	}

}