package strings;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string.");
		String str = sc.next();
		
		System.out.println("Enter the second string.");
		String str1 = sc.next();
		
		boolean flag = false;
		
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			for (int j = 0; j< str1.length(); j++) {
				if (str1.charAt(j)== c) {
				    flag = true;
				    break;
				}
			
				
			}
			if (!flag) {
				break;
			}
		}
		if(flag) {
			System.out.println("It's an Anagram.");
		}else {
			System.out.println("Not an ANAGRAM");
		}
			
	}

}
