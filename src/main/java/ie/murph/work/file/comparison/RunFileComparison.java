package main.java.ie.murph.work.file.comparison;

import main.java.ie.murph.work.file.comparison.delimiter.Delimiter;
import main.java.ie.murph.work.file.comparison.read.ReadFile;

public class RunFileComparison {
	private static final String DATA_FILENAME = "data/test-data.txt";
	private static Delimiter delimiter = new Delimiter(",");
	
	public static void main(String[] args){
		ReadFile readFile = new ReadFile(DATA_FILENAME, delimiter);
		readFile.read();
	}
}
