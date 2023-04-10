package interview.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Scanner sc =new Scanner (System.in);
		int st = sc.nextInt();
		int end= sc.nextInt();
		String substring = str.substring(st, end);
		System.out.println(substring);
	}

}
