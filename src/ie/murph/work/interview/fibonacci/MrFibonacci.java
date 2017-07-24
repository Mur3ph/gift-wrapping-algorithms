package ie.murph.work.interview.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MrFibonacci {

	private static Map<Long, Long> previousValuesHolder;
    static {
        previousValuesHolder = new HashMap<Long, Long>();
        previousValuesHolder.put(Long.valueOf(0), Long.valueOf(0));
        previousValuesHolder.put(Long.valueOf(1), Long.valueOf(1));
    }
    public static long getFibonacciOf(long n) {
        if (n== 0) {

            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (previousValuesHolder.containsKey(Long.valueOf(n))) {
                return previousValuesHolder.get(n);
            } {

                long newValue = getFibonacciOf(n-2) + getFibonacciOf(n-1);
                previousValuesHolder.put(Long.valueOf(n),     Long.valueOf(newValue));
                return newValue;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (true) {
            System.out.println("Enter n :");
            long n = scanner.nextLong();
            if (n >= 0) {
                long beginTime = System.currentTimeMillis();
                long fibo = getFibonacciOf(n);
                long endTime = System.currentTimeMillis();

                long delta = endTime - beginTime;

                System.out.println("F(" + n + ") = " + fibo + " ... computed     in " + delta + " milliseconds");
            } else {
                break;

            }
        }
    }
}
