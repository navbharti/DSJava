package lab4.inlab;

public class MyPoint {

private int x = 0;

private int y = 0;

public MyPoint() {}

public MyPoint(int x, int y) {

this.x = x;

this.y = y;

}

public int getX() {

return this.x;

}

public void setX(int x) {

this.x = x;

}

public int getY() {

return this.y;

}

public void setY(int y) {

this.y = y;

}

public void setXY(int x, int y) {

this.x = x;

this.y = y;

}

public double distance(int x, int y) {

int xDiff = this.x - x;

int yDiff = this.y - y;

return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

}

public double distance(MyPoint another) {

int xDiff = this.x - another.getX();

int yDiff = this.y - another.getY();

return Math.sqrt(xDiff*xDiff + yDiff*yDiff);

}

public String toString() {

return "(" + this.x + ", " + this.y + ")";

}

public static void main(String[] args)

{

MyPoint p1 = new MyPoint(0, 0);

MyPoint p2 = new MyPoint(10, 30);

System.out.println("Passing Object as Reference");

System.out.println(p1.distance(p2));

}

}