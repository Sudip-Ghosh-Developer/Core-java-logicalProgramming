package interview.com;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		 
		/*
		 * reverse string
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your  santence:");
		String str= sc.nextLine();
		String rev = "";
		for(int i =str.length()-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
			
		}
		System.out.println("reverse sentance:"+rev);
		
	}
	}


