package strings;
import java.util.ArrayList;
import java.util.Collections;


public class MyArrayList {

	public static void main(String[] args) {
	
		ArrayList <Integer> a= new ArrayList <Integer>();
		ArrayList <String> b = new ArrayList<String>();
			
		a.add(1);
		a.add(3);
		a.add(78);
		a.add(21);
		b.add("Tia");
		b.add("Sneha");
		b.add("Umang");
		b.add("Nikhat");

//		a.remove(2);
	    b.spliterator();
		
//		Collections.sort(b);
		Collections.sort(a);
		
	
//		System.out.println(a);
		System.out.println(b);
	}
}
