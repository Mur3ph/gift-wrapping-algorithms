package ie.murph.work.interview.workday;

public class Workday {
	private int total = 0;
	private final int limit = 1000;

	public void numberDivableByThreeAndFive() {
		for (int x = 0; x < limit; x++) {
			numberDividableByThree(x);
			numberDividableByFive(x);
		}
		System.out.println("First: " + total);
	}

	private void numberDividableByThree(int numberToCheckAgainst) {
		if (hasNoRemainder(numberToCheckAgainst, 3)) {
			total += numberToCheckAgainst;
		}
	}

	private void numberDividableByFive(int numberToCheckAgainst) {
		if (hasNoRemainder(numberToCheckAgainst, 5)) {
			total += numberToCheckAgainst;
		}
	}

	public void numberDividableByThreeAndFivePartDeux() {
		System.out.println("");
		total = 0;
		for (int x = 0; x < limit; x++) {
			if (hasNoRemainder(x, 3) || hasNoRemainder(x, 5)) {
				total += x;
			}
		}
		System.out.println("Second: " + total);
	}

	private boolean hasNoRemainder(int index, int numberToCheck) {
		return index % numberToCheck == 0;
	}
}
