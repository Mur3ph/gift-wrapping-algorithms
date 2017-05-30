package ie.murph.work.file.comparison;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareFile {
	private String DATA_FILE_ONE_URL;
	private String DATA_FILE_TWO_URL;
	private final List<Integer> mainNumbers;
	private final List<Integer> bonusNumbers;
	private Scanner READ_FILE_ONE;
	private Scanner READ_FILE_TWO;

	public CompareFile(final String file_one, final String file_two) {
		DATA_FILE_ONE_URL = file_one;
		DATA_FILE_TWO_URL = file_two;
		mainNumbers = new ArrayList<Integer>();
		bonusNumbers = new ArrayList<Integer>();
	}
	
	public void read(){
		try {
			READ_FILE_ONE = new Scanner(new File(DATA_FILE_ONE_URL));
			READ_FILE_TWO = new Scanner(new File(DATA_FILE_TWO_URL));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readTextFile() {
		searchForComa();

		while (isStillDataInTextFile()) {
			
		}
		closeScanner();
	}

	private void searchForComa() {
		READ_FILE_ONE.useDelimiter(",");
	}

	private boolean isStillDataInTextFile() {
		return READ_FILE_ONE.hasNext();
	}
	
	private String stillDataInTextFile() {
		return READ_FILE_TWO.nextLine();
	}

	private void closeScanner() {
		READ_FILE_ONE.close();
	}

	public List<Integer> getUnsortedMainLottoNumbersFromTextFile() {
		return this.mainNumbers;
	}

	public List<Integer> getUnsortedBonusLottoNumbersFromTextFile() {
		return this.bonusNumbers;
	}
}
