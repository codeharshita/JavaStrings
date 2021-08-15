package strings;
import java.util.Scanner;

public class SumJava {


	 static int sum=0;
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n = sc.nextInt();
		
		for (int i =0;i<=n;i++) {
			sum  = sum +i;
			
//			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
