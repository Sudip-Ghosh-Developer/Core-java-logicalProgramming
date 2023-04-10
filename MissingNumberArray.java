package interview.com;

public class MissingNumberArray {

 
 void main(String[] args) {
 int []arr = {34,5,6,7,8,9,10,11,12,13,14,16};
      int n = arr.length+1;
      int sum = n*(n+1)/2;
      int num = 0;
      for(int i:arr) {
    	  num=num+i;
      }
      int missingnumber = sum-num;
      System.out.println(missingnumber);
}
}
