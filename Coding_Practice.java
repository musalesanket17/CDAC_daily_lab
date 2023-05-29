package p1;

public class test {
	
	
	  public static void check() {
		   
		   for(int i=0;i<10;i++) {
			    
			   if(i % 2 == 0)
				   System.err.println(i+" Number is even");
			   
			   else
				   System.out.println(i+" Number is odd");
		   }
	  }
	  
	  public static void Natural_sum(int n) {
		  
		  int res = n*(n+1)/2;
		  System.out.println("Sum of First N Natural number is : " + res);
		  int sum =0 ;
		  for(int i=1;i<=n ; i++) {
			  
			   sum+=i;
		  }
		  System.out.println(sum);
		  
	  }
	  
	  public static void sumBet2Number(int n , int m) {
		 
		   int sum = 0;
		   
		   for(int i=n ; i<=m;i++) {
			   
			   sum+=i;
		   }
		   System.out.println("Sum between two numbers is :  "+sum);
	  }
	  
	  public static void GretestFromThreeNumbers(int n , int m , int a) {
		   
		    int temp =  n > m ? n : m ;
		    
		    int res = temp > a ? temp :a;
		    System.out.println(res + " is greater in three numbers ");
	  }
    
	  public static void main(String[] args) {
		  GretestFromThreeNumbers(2,10,500);
//		  sumBet2Number(5,10);
//		  Natural_sum(5);
//		  check();
      }
	  
}
