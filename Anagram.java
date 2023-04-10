package interview.com;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		String s1= sc.nextLine();
		String s2 = sc.nextLine();
		String input1 = s1.replaceAll("\\s","");
		String input2 = s2.replaceAll("\\s","");
		 boolean temp = true;
		 if(s1.length()!=s2.length()) {
			 temp=false;
		 }else {
			 char []c1 = input1.toLowerCase().toCharArray();
			 char []c2 = input2.toLowerCase().toCharArray();
			 
			 
			 Arrays.sort(c1);
			 Arrays.sort(c2);
			 temp= Arrays.equals(c1, c2);
			 
		 }
		 if(temp) {
			 System.out.println(s1+" and "+s2+" -> this is anagram");
		 }else {
			 System.out.println(s1+" and "+s2+" -> this is not anagram");

		 }
		 System.out.println("ghjkl");
		
		
		
	}
}
