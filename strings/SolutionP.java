package strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class SolutionP {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
         java.math.BigInteger n = sc.nextBigInteger();
         sc.close();
         
         System.out.println(n.isProbablePrime(5)?" prime": "not prime");
        
		

	}

}
