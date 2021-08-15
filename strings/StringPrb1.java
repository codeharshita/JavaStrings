package strings;

import java.util.Scanner;

public class StringPrb1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String A = sc.next();
		String B = sc.next();
//	H	String C = sc.next();
		
		
		System.out.println( A.length()+B.length());
		System.out.println((A.compareTo(B)>4)?"YES":"NO");
//		System.out.println(A.substring[0,1).toUpperCase +);
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length())+" "+  B.substring(0,1).toUpperCase()+ B.substring(1,B.length()));
		
	}

}
