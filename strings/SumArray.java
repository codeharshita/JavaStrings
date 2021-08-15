package strings;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,5,6};
		int b[]= {1,4,6,3};
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<i;j++) {
				
				System.out.println(a[i]+b[j]);
			}
		}
	}

}
