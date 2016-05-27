package pract1;

import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
		
		double subtotal, gratuity; 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Subtotal ");
		subtotal = s.nextInt();
		
		System.out.println("Enter Gratuity ");
		gratuity = s.nextInt();
		
		System.out.println("The Gratuity is $" + (subtotal*gratuity/100) + " and total is $" + (subtotal+(subtotal*gratuity/100)));
	}

}
