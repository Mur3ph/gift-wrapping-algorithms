package main.java.ie.murph.work.interview;

import main.java.ie.murph.resources.ResourceForAlgorithmsToLearn;
import main.java.ie.murph.work.interview.cr2.CR2PrimeNumber;
import main.java.ie.murph.work.interview.emc.EMCSnapCracklePop;
import main.java.ie.murph.work.interview.workday.WorkdayDividable;

public class Answer {
	public static void main(String[] args) {
//		Resources for algorithms to learn
		ResourceForAlgorithmsToLearn resourceForAlgorithmsToLearn = new ResourceForAlgorithmsToLearn();
		System.out.println(resourceForAlgorithmsToLearn.printTaskSheet());
		
		EMCSnapCracklePop emc = new EMCSnapCracklePop();
		emc.SnapCrackleOrPop();
		emc.reverseWord();

		System.out.println("");

		WorkdayDividable workday = new WorkdayDividable();
		workday.runDivableCheck();
		workday.numberDividableByThreeAndFivePartDeux();

		System.out.println("");

		CR2PrimeNumber cr2 = new CR2PrimeNumber();
		cr2.isPrime();
		
		System.out.println("");
		
//		Resources for algorithms to learn
		System.out.println(resourceForAlgorithmsToLearn.printTaskSheet());
	}

}
