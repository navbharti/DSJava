package session14.p1;

public class ChArray {

		public static void main(String[] args) {

		char[] charArray = { 'C', 'o', 'd', 'e', 'i', 'n', 'g', ' ','K','L', 'U'};

		// Convert char [] to String

		String str = new String(charArray);

		System.out.println("String class constructors – character array as argument");

		System.out.println(str);

		System.out.println("Character Extraction");

		System.out.println(str.charAt(0));

		char[] charArr = new char[10];

		str.getChars(8, 11, charArr, 0);

		System.out.println(charArr);

		String s = "KL University";

		char[] gfg = s.toCharArray();

		System.out.println(gfg);

		System.out.println(s.length());

		System.out.println("hello".equals("hello"));

		String str1 = "hello";

		String str2 = str1;

		System.out.println(str1==str2);

		String str3="Hello";

		System.out.println(str1.equalsIgnoreCase(str3));

		String Str1 = new String("Welcome to KL University");

		String Str2 = new String("KL UNiversity");

		System.out.println(Str1.regionMatches(11, Str2, 0, 12));

		System.out.println("Welcome".startsWith("Wel"));

		System.out.println("Welcome".endsWith("come"));

		}

		}