package interview.com;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 class highest {
	 
  public int findSecondHighest(int[] array) {
 int highest = Integer.MIN_VALUE;
 int secondHighest = Integer.MIN_VALUE;
 
 for (int i : array) {
 if (i > highest) {
 secondHighest = highest;
 highest = i;
 } else if (i > secondHighest) {
 secondHighest = i;
 }
 
 }
 return secondHighest;
 }
 }

public class Sceond_Highest_Number {
	
	public  static void main(String[]args) {
		 
		int[]a= { 12,34,56,67,78,8,34};
		highest h = new highest();
		int c= h.findSecondHighest(a);
		System.out.println(c);
     /*
      * using java 8
      * */
		List<Integer> list= Arrays.asList(56,89,90,67,34);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));
      
     
    
		
 }

}
