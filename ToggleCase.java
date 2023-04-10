package interview.com;

import java.util.Scanner;

// import java.util.*;
public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String toggle ="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				toggle= toggle+Character.toLowerCase(str.charAt(i));
			} else {
				toggle = toggle+ Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(toggle);
	}

}
