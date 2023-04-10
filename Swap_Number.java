package interview.com;

public class Swap_Number {

	public static void main(String[] args) {
		
        int A = 70;
        int B = 78 ;
        System.out.println(" A original value is :"+ A);
        System.out.println(" B original value is :" + B);
        
//        B= B+A ;       // type - 1
//        A = B- A;
//        B= B-A;
        int C = A;
        A=B;           	// type-2
        B=C;
        
          System.out.println(" A swap value is :"+ A);
          System.out.println("B swap value is :" +B);
	}

}
