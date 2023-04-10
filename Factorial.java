package interview.com;

class FactorialRecursion{
	public static int fact (int f) {
		if (f!=0) {
			return f*fact(f-1);
		}else {
			return 1;
		}
	}
}



public class Factorial {
 public static void main(String[] args) {
	 System.out.println(FactorialRecursion.fact(5));
	 
	 int a= 5;
	 int fact=1;
	 for(int i=1;i<=a;i++) {
		 fact= fact*i;
	 }
	 System.out.println(fact);
	 
	
}
}

