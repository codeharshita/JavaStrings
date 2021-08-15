package strings;
import java.math.BigInteger;
import java.util.Scanner;

public class Prb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new  Scanner(System.in);
		java.math.BigInteger a = sc.nextBigInteger();
		java.math.BigInteger b = sc.nextBigInteger();
		
		 BigInteger sum = a.add(b);
		 BigInteger multiply = a.multiply(b);
		
		System.out.println( "THE SUM IS "+ sum);
		System.out.println( "THE Multiplication is "+ multiply);
//		System.out.println(a " " * b);
		
		

	}

}
