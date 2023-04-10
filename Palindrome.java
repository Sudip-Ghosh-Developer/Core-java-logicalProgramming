package interview.com;
 import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		 System.out.print(" input here ......:");
		String a = sc.nextLine();
		String str ="";
		for(int i= a.length()-1;i>=0;i--) {
			str = str+a.charAt(i);
		}
		
		if(a.equals(str)) {
			System.out.println(" yes this is palindom ");
		}
		else {
			System.out.println("no this not palindrom ");
		}
    
	}

}
