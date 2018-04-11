package main.java.ie.murph.work.interview.cr2;

import java.util.Scanner;

public class CR2 {

	private final Scanner SCANNER = new Scanner(System.in);
	private int userInputNumber;
	private boolean isItPrime = true;
	
	public void isPrime() {
		System.out.println("CR2.. ");
		askUserToEnterNumber();
		readUserInput();
		
		for (int x = 2; x < userInputNumber / 2; x++) {
			if (hasNoRemainder(x)) {
				setIsItPrime(false);
				break;
			}
		}
		
		printResult();
		closeScanner();
	}
	
	private void askUserToEnterNumber() {
		System.out.println("Enter number to check if it's a prime number!\n");
	}
	
	private void readUserInput(){
		userInputNumber = SCANNER.nextInt();
	}
	
	private boolean hasNoRemainder(int index){
		return userInputNumber % index == 0;
	}
	
	private void setIsItPrime(boolean isItPrime){
		this.isItPrime = isItPrime;
	}
	
	private boolean getIsItPrime(){
		return this.isItPrime;
	}
	
	private int printUserInputNumber(){
		return userInputNumber;
	}
	
	private void printResult(){
		System.out.println("Is " + printUserInputNumber() + " a prime numer: " + getIsItPrime());
	}
	
	private void closeScanner(){
		SCANNER.close();
	}
}
