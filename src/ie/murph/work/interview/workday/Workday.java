package ie.murph.work.interview.workday;

public class Workday {
	private int total = 0;
	private int limit = 1000;

	public void numberDivableByThreeAndFive() {
		System.out.println("Workday Part One");
		for (int x = 0; x < limit; x++) {
			if (hasNoRemainder(x, 3)) {
				total = total + x;
			} else if (hasNoRemainder(x, 5)) {
				total = total + x;
			}
		}
		System.out.println("First: " + total);
	}

	public void numberDivableByThreeAndFive2() {
		System.out.println("");
		System.out.println("Workday Part Two");
		total = 0;
		for (int x = 0; x < limit; x++) {
			if (hasNoRemainder(x, 3) || hasNoRemainder(x, 5)) {
				total = total + x;
			}
		}
		System.out.println("Second: " + total);
	}
	
	private boolean hasNoRemainder(int index, int numberToCheck) {
		return index % numberToCheck == 0;
	}
}
