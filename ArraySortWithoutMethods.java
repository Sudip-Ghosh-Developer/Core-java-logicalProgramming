package interview.com;


public class ArraySortWithoutMethods {
	public static void main(String[] args) {
		int[]arr= {12,34,15,-2,-67,900,1000,677};
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
		
		
	