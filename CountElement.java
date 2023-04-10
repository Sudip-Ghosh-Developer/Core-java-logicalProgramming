package interview.com;
 import java.util.*;
public class CountElement {
public static void main(String[] args) {
	 
	Scanner sc =new Scanner(System.in);
	String str = sc.nextLine();
	String[]input1= str.split(" ");
	/*
	 *  Java program to find duplicate characters in the String
	 * */

	HashMap<Character,Integer> count = new HashMap<>();
	for (int i =0;i<str.length();i++) {
		char c = str.charAt(i);
		if(count.containsKey(c)) {
			count.put(c,count.get(c)+1 );
		}else
		{
			count.put(c, 1);
		}
	}
	System.out.println(count);
	
}
}
