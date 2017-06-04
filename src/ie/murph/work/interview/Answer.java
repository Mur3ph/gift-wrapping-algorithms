package ie.murph.work.interview;

import java.util.Scanner;

public class Answer 
{
	public static void main(String[] args)
	{
		System.out.println("EMC");
		for(int x = 1; x < 51; x++)
		{
			if(x % 3 == 0 && x % 5 == 0)
			{
				System.out.println("Snap");
			}
		    else if(x % 3 == 0)
			{
				System.out.println("Crackle");
			}
			else if(x % 5 == 0)
			{
				System.out.println("Pop");
			}
			else
			{
				System.out.println(x);
			}
		}//END OF LOOP
		
		System.out.println("");
		String word = "Navan";
		StringBuilder reverseIt = new StringBuilder(word);
		reverseIt.reverse();
		String jobsDone = reverseIt.toString(); 
		System.out.println("String reverced innit: " + jobsDone);
		System.out.println("");
		
		System.out.println("Workday Part One");
		int limit = 1000;
		int total = 0;
		for(int x = 0; x < limit; x++)
		{
			if(x % 3 == 0)
			{
				total = total + x;
			}
			else if(x % 5 == 0)
			{
				total = total + x;
			}
		}
		System.out.println("First: " + total);
		
		System.out.println("");
		System.out.println("Workday Part Two");
		total = 0;
		for(int x = 0; x < limit; x++)
		{
			if(x % 3 == 0 || x % 5 == 0)
			{
				total = total + x;
			}
		}
		System.out.println("Second: " + total);
		
		System.out.println();
		System.out.println("CR2.. ");
		System.out.println("Enter number to check if it's a prime number!\n");
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();
		boolean isItPrime = true;
		for(int x = 2; x < num/2; x++)
		{
			if(num % x == 0)
			{
				isItPrime = false;
				break;
			}
		}
		System.out.println("Is " + num + " a prime numer: " + isItPrime);
		scanner.close();
	}
	
}//END OF CLASS
