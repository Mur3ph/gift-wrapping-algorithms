package ie.murph.work.interview.workday;

public class Workday {
	private int total = 0;
	private final int limit = 18;
	private final int numberThree = 3;
	private final int numberFive = 5;
	private final int noRemainder = 0;

//	TODO: This calculates twice, if both (3 and 5) are divisible by one number
	public void numberDivableByThreeAndFive() {
		for (int x = 0; x < limit; x++) {
			numberDividableByThree(x);
			numberDividableByFive(x);
		}
		System.out.println("First: " + total);
	}

	private void numberDividableByThree(int loopingNumbersToCheckAgainst) {
		if (hasNoRemainder(loopingNumbersToCheckAgainst, numberThree)) {
			total += loopingNumbersToCheckAgainst;
		}
	}

	private void numberDividableByFive(int loopingNumbersToCheckAgainst) {
		if (hasNoRemainder(loopingNumbersToCheckAgainst, numberFive)) {
			total += loopingNumbersToCheckAgainst;
		}
	}

//	TODO: This calculates once, if both (3 and 5) are divisible by one number
	public void numberDividableByThreeAndFivePartDeux() {
		System.out.println("");
		total = 0;
		for (int loopingNumbersToCheckAgainst = 0; loopingNumbersToCheckAgainst < limit; loopingNumbersToCheckAgainst++) {
			if (hasNoRemainder(loopingNumbersToCheckAgainst, numberThree) || hasNoRemainder(loopingNumbersToCheckAgainst, numberFive)) {
				total += loopingNumbersToCheckAgainst;
			}
		}
		System.out.println("Second: " + total);
	}

	private boolean hasNoRemainder(int index, int numberToCheck) {
		return index % numberToCheck == noRemainder;
	}
}
