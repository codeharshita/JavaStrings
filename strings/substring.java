package strings;

public class substring {

	public static void main(String[] args) {
	
		String str = "Sachin Tendulkar";
		System.out.println(str.substring(0,6).toUpperCase()+ " "+ str.substring(6,str.length()));
		System.out.println(str.substring(0,1).toUpperCase()+ str.substring(1, str.length()));
	}

}
