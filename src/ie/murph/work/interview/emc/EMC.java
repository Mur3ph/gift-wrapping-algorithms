package ie.murph.work.interview.emc;

public class EMC {

	private final int MAX_NUMBER = 51;
	private final int NUMBER_THREE = 3;
	private final int NUMBER_FIVE = 5;
	private int index;

	public void SnapCrackleOrPop() {
		System.out.println("EMC");
		for (index = 1; index < MAX_NUMBER; index++) {
			System.out.println(snap(index));
			System.out.println(crackle(index));
			System.out.println(pop(index));
			System.out.println(printIndex());
		}
	}

	private String snap(int index) {
		if (hasNoRemainder(index, NUMBER_THREE) && hasNoRemainder(index, NUMBER_FIVE)) {
			return "Snap";
		}
		return "";
	}

	private String crackle(int index) {
		if (hasNoRemainder(index, NUMBER_THREE)) {
			return "Crackle";
		}
		return "";
	}

	private String pop(int index) {
		if (hasNoRemainder(index, NUMBER_FIVE)) {
			return "Pop";
		}
		return "";
	}

	private boolean hasNoRemainder(int index, int numberToCheck) {
		return index % numberToCheck == 0;
	}

	private int printIndex() {
		return this.index;
	}

	public void reverseWord() {
		System.out.println("");
		String word = "Navan";
		StringBuilder reverseIt = new StringBuilder(word);
		reverseIt.reverse();
		String jobsDone = reverseIt.toString();
		System.out.println("String reverced innit: " + jobsDone);
		System.out.println("");
	}

}
