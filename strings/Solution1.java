package strings;

public class Solution1 {

	public static void main(String[] args) {

		try {
		int a = 10;
		int b = 0;
		
		int c = a/b;
		
		System.out.println(c);

	}catch(Exception e)
		{
		   System.out.println("Error");
		
		}finally {
			System.out.println("Something Wenrt Wrong!!");//DEFAULT
		}
		
	}

}
