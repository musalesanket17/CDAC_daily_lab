package Array.List.in;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;



public class ArrayList2 {
	
	 public static  List<Integer> getarray(){
		  
		 List<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 

		 return list;
	 }
  
	 public static void main(String[] args) {
		 
		   
		  List<Integer> list = new ArrayList<>();
		  list.add(10);
		  list.add(20);
		  list.add(30);
		  /*
		  List<Integer>  col = ArrayList2.getarray();
		  
		  if(col.containsAll(list)) {
			  System.out.println("OKKKK");
		      col.removeAll(list);
		      System.out.println(col);
		  }
		  
		  else
			  System.out.println("Not Okk");
		  */
		  
		  Integer[] i = new Integer[list.size()];
		  list.toArray(i);
		  System.out.println(Arrays.toString(i));
 	}
	
}
