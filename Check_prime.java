package interview.com;
 import java.util.*;
public class Check_prime {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("enter your number :");
	   int A= sc.nextInt();
	   int count = 0;
	   int k=A/2;
		if(A==0||A==1) {
			System.out.println(" this is not a prime number");
		}
		 for(int i=2 ;i<=k;i++) {
			 if(A%i==0) {
				 System.out.println("this is not prime ");
				 System.out.println(i);
				 count=1;
				 break;
			 }
		 }
		 if(count==0) {
			 System.out.println("this is prime");
		 }
		
		
	}

}
