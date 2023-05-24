package Array.List.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
public class ArrayList1 {
	
	public static  List<Integer> getlist(){
		 ArrayList<Integer> arraylist = new ArrayList<>();
		  arraylist.add(10);
		  arraylist.add(20);
		  arraylist.add(40);
		  arraylist.add(50);
		  arraylist.add(2, 30);
		  arraylist.add(5,60 );
		
		return arraylist;
	}
	
	public static void main(String[] args) {
		
		 List<Integer> list = ArrayList1.getlist();
		 ArrayList<Integer> arraylist = new ArrayList<>();
		 arraylist.add(100);
		 arraylist.addAll(0,list);
		 arraylist.forEach(el->System.out.println(el));
	}

	 public static void main2(String[] args) {
		/*
		   int []arr = new int[3];
		   System.out.println(arr.length);//3
		  List<Integer> arraylist = ArrayList1.getlist();
      
		   for(int i=0;i<arraylist.size();i++) {
			    
			    System.out.println(arraylist.get(i));
		   }
		    for(Integer el:arraylist) {
		    	System.out.println(el);
		    }
		  System.out.println(arraylist.toString());
		  */
		  List<Integer> arraylist = ArrayList1.getlist();
          arraylist.forEach(el->System.out.println(el));
		 
	}
	 
	 public static void main1(String[] args) {
		  Collection<Integer> collection = new ArrayList<>();
		  List<Integer> list = new ArrayList<>();
		  ArrayList<Integer> arraylist = new ArrayList<>();
	}
}
