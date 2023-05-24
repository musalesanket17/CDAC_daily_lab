package P1;

import java.util.Arrays;

public class Array_Test {
	
	private int[] arr;
	
	

	public Array_Test() {
		
		this.arr = new int[] {1,2,3,4,5};
		
		
	}
	
	
	public String toString() {
		return Arrays.toString(arr);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Test t = new Array_Test();
         String str = t.toString();
         System.out.println(str);
	}




	
}
