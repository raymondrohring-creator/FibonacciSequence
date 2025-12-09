package day6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms in the Fibonacci sequence you would like to view...");
		long terms = scanner.nextInt();
		long a = 0, b = 1;
		System.out.println("Fibonacci sequence:");
		
		for (long i = 1; i <= terms; i++)
		{
			System.out.println(a);
			long next = a + b;
			a = b;
			b = next;
		}
		
		scanner.close();

	}

}
