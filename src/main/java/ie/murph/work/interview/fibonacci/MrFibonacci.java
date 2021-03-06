package main.java.ie.murph.work.interview.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MrFibonacci {
	
	private static Map<Long, Long> previousValuesHolder;
	private static final Scanner SCANNER = new Scanner(System.in);

	static {
		previousValuesHolder = new HashMap<Long, Long>();
		previousValuesHolder.put(Long.valueOf(0), Long.valueOf(0));
		previousValuesHolder.put(Long.valueOf(1), Long.valueOf(1));
	}

	public static void main(String[] args) {
		System.out.println(fibonacciExplained());
		System.out.println(documentation());

		System.out.println("Enter number: ");
		long number = SCANNER.nextLong();
		if (isNumberGreaterThanZero(number)) {
			long beginTime = getCurrentTimeInMilliseconds();
			long fibonacci = getFibonacciOf(number);
			long endTime = getCurrentTimeInMilliseconds();

			long delta = endTime - beginTime;

			System.out.println(printFibonacci(number, fibonacci, delta));
			askUserToContinue();
		} 
	}

	private static boolean isNumberGreaterThanZero(long number) {
		return number >= 0;
	}

	private static long getCurrentTimeInMilliseconds() {
		return System.currentTimeMillis();
	}

	private static long getFibonacciOf(long number) {
		if (isZero(number)) {
			return 0;
		} else if (isOne(number)) {
			return 1;
		} else {
			if (previousValuesHolder.containsKey(Long.valueOf(number))) {
				return previousValuesHolder.get(number);
			}
			{
				long newValue = getFibonacciOf(number - 2) + getFibonacciOf(number - 1);
				previousValuesHolder.put(Long.valueOf(number), Long.valueOf(newValue));
				return newValue;
			}

		}
	}

	private static boolean isZero(long number) {
		return number == 0;
	}

	private static boolean isOne(long number) {
		return number == 1;
	}

	private static String printFibonacci(long number, long fibo, long delta) {
		return "F(" + number + ") = " + fibo + " ... computed     in " + delta + " milliseconds";
	}

	private static String fibonacciExplained() {
		return "      Fibonacci was a mathematician from the Republic of Pisa in what is now Italy, "
				+ "\n considered to be the most talented Western mathematician of the Middle Ages"
				+ "\n 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, "
				+ "\n The next number is found by adding up the two numbers before it.";
	}

	public static void askUserToContinue() {
		System.out.println("Do you want to run it again: (y/n)");
		String userResponse = SCANNER.nextLine();
		if (userWantsToContinue(userResponse)) {
			resetMainThread();
		} else if (userDoesNotWantToContinue(userResponse)) {
			System.out.println("Good bye!");
			exitMainThread();
		} else
			askUserToContinue();
	}

	private static boolean userWantsToContinue(String userResponse) {
		return userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes");
	}
	
	private static boolean userDoesNotWantToContinue(String userResponse) {
		return userResponse.equalsIgnoreCase("n") || userResponse.equalsIgnoreCase("no");
	}

	private static void resetMainThread() {
		main(new String[0]);
	}
	
	private static void exitMainThread() {
		System.exit(0);
	}

	private static String documentation() {
		return "   \n Code Resource: https://stackoverflow.com/questions/29317414/making-fibonacci-faster?"
				+ "\n Getting a 'java.lang.StackOverflowError', when using 123456 number!"
				+ "\n Resource: https://examples.javacodegeeks.com/java-basics/exceptions/java-lang-stackoverflowerror-how-to-solve-stackoverflowerror/";
	}
}
