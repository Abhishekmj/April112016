package pract1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter ASCII code ");
		num = s.nextInt();
		
		char c = (char)num;
		System.out.println();
		
		System.out.println("Charter is " + c);
		
	}
	
}
