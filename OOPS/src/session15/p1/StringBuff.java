package session15.p1;

public class StringBuff {

		// Concatenates to String

		public static void concat1(String s1)

		{

		s1 = s1 + "University";

		}

		// Concatenates to StringBuffer

		public static void concat3(StringBuffer s3)

		{

		s3.append("University");

		}

		public static void main(String[] args)

		{

		String s1 = "KL";

		concat1(s1); // s1 is not changed

		System.out.println("String: " + s1);

		StringBuffer s2 = new StringBuffer("KL");

		concat3(s2); // s2 is changed

		System.out.println("StringBuffer: " + s2);

		StringBuffer buffer1 = new StringBuffer( ) ;

		StringBuffer buffer2 = new StringBuffer(50) ;

		StringBuffer buffer3 = new StringBuffer("hello") ;

		// to know the storing capacities

		System.out.println("buffer1 capacity: " + buffer1.capacity()); // 16

		System.out.println("buffer2 capacity: " + buffer2.capacity()); // 50

		System.out.println("buffer3 capacity: " + buffer3.capacity()); // 21 (16 + 5 )

		//to know the number of characters present

		System.out.println("\nbuffer1 length: " + buffer1.length()); // 0

		System.out.println("buffer2 length: " + buffer2.length()); // 0

		System.out.println("buffer3 length: " + buffer3.length()); // 5

		StringBuffer sb=new StringBuffer("Hello ");

		sb.append("Java");

		System.out.println(sb);

		StringBuffer sb1=new StringBuffer("Hello ");

		sb1.insert(1,"Java");

		System.out.println(sb1);

		sb1.replace(1,3,"Java");

		System.out.println(sb1);

		System.out.println(sb);

		sb.reverse();

		System.out.println(sb);

		System.out.println(sb.charAt(0));

		sb.setCharAt(0,'J');

		System.out.println(sb);

		sb.deleteCharAt(0);

		System.out.println(sb);

		System.out.println(sb.substring(0,4));

		}

		}