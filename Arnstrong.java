package interview.com;

import java.util.Scanner;

public class Arnstrong {
	
	/// cheack the armstrong number.......
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.print("enter your 3digit number :");
	     int usernumber = sc.nextInt();
		 int sum=0;
		 int num = usernumber;
		 int temp;
		 while (num!=0) {
			 temp=num%10;
			 sum = sum+temp*temp*temp;
			 num= num/10;
		 }
		 if(sum==usernumber) {
			 System.out.println("this is armstong number");

		 } else {
			 System.out.println("this is not armstrong number");
		 }
		
	}
}
