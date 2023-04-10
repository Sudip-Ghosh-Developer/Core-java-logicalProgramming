package interview.com;
 import java.util.*;
public class Vowel_Letter {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println(" enter your sentance :");
		 String a = sc.nextLine();
		 int k =0 ;
       
		  for ( int i =0; i<a.length();i++) {
			  
			  if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||
					  a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U') {
				 
				   
				   k++;
				     
	                    		   
				   }
			  	
		  }
		  if(k>0) {
			  System.out.println("yes present in vowel"+k);
		  }
		  else {
			  System.out.println("no present in vowel ");
		  }
				   
			  
		  
	}

}
