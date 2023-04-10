package interview.com;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveWhiteSpace {
      public static void main(String[] args) {
		 /*
		  * remove White space in string 
		  */
    	  Scanner sc = new Scanner (System.in);
    	  System.out.print(" enter your String:");
    	  String input = sc.nextLine();
    	  String revomeWhitespace = Arrays.stream(input.split("\\s+")).collect(Collectors.joining());
    	   System.out.println("remove white space :"+revomeWhitespace);
    	   
    	   /*
    	    * remove Duplicate sentence and word and char in String 
    	    */
    	   
   String removeDuplicate = Arrays.stream(input.split("\\s+")).distinct().collect(Collectors.joining(" "));
    	 System.out.println(" remove duplicate word :"+ removeDuplicate);  
	}
}
