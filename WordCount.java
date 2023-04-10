package interview.com;

import java.util.Scanner;
import java.util.*;

public class WordCount {
	
	

	public static void main(String[] args) {
		 /*
		  *  Java program to find duplicate word in the String?
		  * */
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] count = input.split(" ");
		HashMap<String,Integer> map = new HashMap<>();
		for(String word : count) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		
	}
	
}
