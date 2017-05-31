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
	
	//TODO: Perhaps only need one scanner, too many scanners
	public void readInContentOfFile(){
		READ_FILE_ONE = getFile(DATA_FILE_ONE_URL);
		READ_FILE_TWO = getFile(DATA_FILE_TWO_URL);
	}
	
	public Scanner getFile(String fileUrl)
	{
		try {
			return new Scanner(new File(fileUrl));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Scanner("");
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
