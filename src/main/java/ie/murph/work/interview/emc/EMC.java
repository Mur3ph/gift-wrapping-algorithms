package main.java.ie.murph.work.interview.emc;

public class EMC {

	private static final String EMPTY_STRING = "";
	private final int MAX_NUMBER = 51;
	private final int NUMBER_THREE = 3;
	private final int NUMBER_FIVE = 5;
	private int INDEX;
	private final String WORD = "Navan";

	public void SnapCrackleOrPop() {
		System.out.println("EMC");
		for (INDEX = 1; INDEX < MAX_NUMBER; INDEX++) {
			System.out.println(snap(INDEX));
			System.out.println(crackle(INDEX));
			System.out.println(pop(INDEX));
			System.out.println(printIndex());
		}
	}

	private String snap(int index) {
		if (hasNoRemainder(index, NUMBER_THREE) && hasNoRemainder(index, NUMBER_FIVE)) {
			return "Snap";
		}
		return EMPTY_STRING;
	}

	private String crackle(int index) {
		if (hasNoRemainder(index, NUMBER_THREE)) {
			return "Crackle";
		}
		return EMPTY_STRING;
	}

	private String pop(int index) {
		if (hasNoRemainder(index, NUMBER_FIVE)) {
			return "Pop";
		}
		return EMPTY_STRING;
	}

	private boolean hasNoRemainder(int index, int numberToCheck) {
		return index % numberToCheck == 0;
	}

	private int printIndex() {
		return this.INDEX;
	}

	public void reverseWord() {
		System.out.println("*** Reverse a String ***");
		StringBuilder reverseIt = convertStringToStringBuilderObj(WORD);
		System.out.println("String reverced innit: " + convertStringBuilderObjToString(reverseStringBuilderObj(reverseIt)));
		System.out.println("");
	}
	
	private StringBuilder convertStringToStringBuilderObj(String stringToConvert){
		return new StringBuilder(stringToConvert);
	}
	
	private StringBuilder reverseStringBuilderObj(StringBuilder builderToReverse){
		return builderToReverse.reverse();
	}
	
	private String convertStringBuilderObjToString(StringBuilder builderToReverse){
		return builderToReverse.toString();
	}

}
