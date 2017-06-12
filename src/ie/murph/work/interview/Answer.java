package ie.murph.work.interview;

import ie.murph.work.interview.cr2.CR2;
import ie.murph.work.interview.emc.EMC;
import ie.murph.work.interview.workday.Workday;

public class Answer {
	public static void main(String[] args) {
		EMC emc = new EMC();
		emc.SnapCrackleOrPop();
		emc.reverseWord();

		System.out.println("");

		Workday workday = new Workday();
		workday.numberDivableByThreeAndFive();
		workday.numberDividableByThreeAndFivePartDeux();

		System.out.println("");

		CR2 cr2 = new CR2();
		cr2.isPrime();
	}

}// END OF CLASS
