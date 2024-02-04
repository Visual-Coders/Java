// StringCompare.java

import java.util.*;

class StringCompare
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		System.out.print("Enter String 1 : ");
		s1 = sc.nextLine();
		System.out.print("Enter String 2 : ");
		s2 = sc.nextLine();
		System.out.println("\n\nComparison ..s1 to s2 : " + s1.compareTo(s2));
		System.out.println("\nComparison ..s2 to s1 : " + s2.compareTo(s1));
	}	
}
