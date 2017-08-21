package ie.murph.util;

import java.util.Scanner;

public class ContinueRead {
	
	private static final Scanner SCANNER = new Scanner(System.in);

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
//		main(new String[0]);
	}
	
	private static void exitMainThread() {
		System.exit(0);
	}
	
}
