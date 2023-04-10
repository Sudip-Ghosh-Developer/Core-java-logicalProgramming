 package interview.com;

import java.util.Scanner;
//	   class fiboRecursion {
//		  
//		    public int fibo(int count) {
//		    	if(count==0) {
//		    		return 0;      // first step print 
//		    	}
//		    	if(count==1|| count==2) {
//		    		return 1;      // 2nd and 3rd step print
//		    	}
//		    	return fibo(count-1)+fibo(count-2);
//		    }
//	  }
//	 
public class Fibonacssi { 
	 
	 public static void main (String[]args) {
		  
//		 Scanner sc = new Scanner(System.in);
//		  System.out.print(" enter your number :");
//		  fiboRecursion fr = new fiboRecursion();
//		  int a = sc.nextInt();
//		  for (int i =0 ;i<=a;i++) {
//			  System.out.print(fr.fibo(i) + " ");
//		  }
//		 
		 
		  int a= 0 ,b=1,c,y=10;
		  System.out.print(a+" "+b);
		  for(int i=2 ;i<y;++i) {
			  c=a+b;
			  System.out.print(" "+c);
			  a=b;
			  b=c;
			
			 
					  
		  }
	 }
	
}	



