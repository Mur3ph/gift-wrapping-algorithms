package ie.murph.work.interview.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MrFibonacci {

	// Resource:
	// https://stackoverflow.com/questions/29317414/making-fibonacci-faster?

	private static Map<Long, Long> previousValuesHolder;
	static {
		previousValuesHolder = new HashMap<Long, Long>();
		previousValuesHolder.put(Long.valueOf(0), Long.valueOf(0));
		previousValuesHolder.put(Long.valueOf(1), Long.valueOf(1));
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter number: ");
			long number = scanner().nextLong();
			if (isNumberGreaterThanZero(number)) {
				long beginTime = System.currentTimeMillis();
				long fibo = getFibonacciOf(number);
				long endTime = System.currentTimeMillis();

				long delta = endTime - beginTime;

				System.out.println("F(" + number + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
			} else {
				break;

			}
		}
	}
	
	private static Scanner scanner(){
		return new Scanner(System.in);
	}
	
	private static boolean isNumberGreaterThanZero(long number){
		return number >= 0;
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
	
	private static boolean isZero(long number){
		return number == 0;
	}
	
	private static boolean isOne(long number){
		return number == 1;
	}
}
