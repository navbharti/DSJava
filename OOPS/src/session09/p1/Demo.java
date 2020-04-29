package session09.p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {

public static void main(String[] args) throws IOException

{

Cuboid cube1 = new Cuboid();

int i = 1;

Scanner inFile = new Scanner(new File("cuboidInput.txt"));

FileWriter outFile=new FileWriter("cuboidOutput.txt");
//OR
/*
Scanner inFile = new Scanner(new File("C:\\Users\\SIVAKUMARS\\eclipse-workspace\\Session91\\src\\p1\\cuboidInput.txt"));

FileWriter outFile=new FileWriter("C:\\Users\\SIVAKUMARS\\eclipse-workspace\\Session91\\src\\p1\\cuboidOutput.txt");
*/
String st1;

while (inFile.hasNext())

{

String line = inFile.nextLine();

StringTokenizer st = new StringTokenizer(line);

if(cube1.setDimensions(Double.parseDouble(st.nextToken()),

Double.parseDouble(st.nextToken()),

Double.parseDouble(st.nextToken())))

{

st1 = "Cuboid "+(i)+"\n";

outFile.write(st1);

st1 = cube1.toString();

outFile.write(st1);

i++;

}

}

inFile.close();

outFile.close();

}

}