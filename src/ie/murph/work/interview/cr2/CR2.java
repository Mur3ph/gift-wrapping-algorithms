package ie.murph.work.interview.cr2;

import java.util.Scanner;

public class CR2
{
    public void isPrime()
    {
	System.out.println("CR2.. ");
	System.out.println("Enter number to check if it's a prime number!\n");
	Scanner scanner = new Scanner(System.in);
	int num;
	num = scanner.nextInt();
	boolean isItPrime = true;
	for (int x = 2; x < num / 2; x++)
	{
	    if (num % x == 0)
	    {
		isItPrime = false;
		break;
	    }
	}
	System.out.println("Is " + num + " a prime numer: " + isItPrime);
	scanner.close();
    }
}
