package ie.murph.work.interview;

import java.util.Scanner;

import ie.murph.work.interview.emc.EMC;
import ie.murph.work.interview.workday.Workday;

public class Answer
{
    public static void main(String[] args)
    {
	EMC emc = new EMC();
	emc.SnapCrackleOrPop();
	emc.reverseWord();
	
	System.out.println("");

	Workday workday = new Workday();
	workday.first();
	workday.second();
	
	System.out.println();
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

}// END OF CLASS
