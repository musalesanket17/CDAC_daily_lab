package P1;
import java.time.LocalDate;
import java.util.Arrays;
public class Date {
	
	private int day;
	private int month;
	private int year;
	private static  LocalDate ld =LocalDate.now();
	public Date() {
		this(ld.getDayOfMonth(),ld.getMonthValue(),ld.getYear() );
		  
		 
		
	}

	public Date(int day, int month, int year) {
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
    public void create(Date[] arr) {
    	  
    	 for(int i=0;i<arr.length ;i++) {
    		 
    		 arr[i] = new Date();
    	 }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Date d=new Date();
//		System.out.println(d.toString());
//		Date []arr = new Date[2];
//		System.out.println(Arrays.toString(arr));
		Date []arr = new Date[3];
		d.create(arr);
		d.prin(arr);
//		 System.out.println( Arrays.toString(arr));
		
		

	}
	public void prin(Date[] arr){
		 
		 if(arr != null) {
			  
			 for(int i=0;i<arr.length;i++) {
				  
				  System.out.println( arr[i].toString() );
			 }
		 }
	}

	@Override
	public String toString() {
		return  this.day + " " + this.month + " " +this.year;
	}
}
