package lab3.inlab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

public static void main(String args[])

{

try {
/*
BufferedReader inputStream1 = new BufferedReader(new FileReader("C:\\Users\\SIVAKUMARS\\eclipse-workspace\\InLabThree1\\src\\p1\\Names.txt"));

BufferedReader inputStream2 = new BufferedReader(new FileReader("C:\\Users\\SIVAKUMARS\\eclipse-workspace\\InLabThree1\\src\\p1\\Address.txt"));
*/
//OR

BufferedReader inputStream1 = new BufferedReader(new FileReader("Names.txt"));

BufferedReader inputStream2 = new BufferedReader(new FileReader("Address.txt"));

String inLine1 = null, inLine2=null;

String res = String.format("%-9s %-30s %s","ID No.","NAME " , "ADDRESS");

System.out.println(res);

while ((inLine1 = inputStream1.readLine()) != null && (inLine2 = inputStream2.readLine()) != null)

{

String[] s1 = inLine1.split("\t");

String[] s2 = inLine2.split("\t");

res = String.format("%s %-30s %s",s1[0],s1[1],s2[1]);

System.out.println(res);

}

inputStream1.close();

inputStream2.close();

} catch (IOException e) {

System.out.println(e.toString());

}

}

}