package ie.murph.work.file.comparison.delimiter;

import java.io.BufferedReader;
import java.util.Scanner;

public class Delimiter {
	private String delimiter;
	private Scanner scanner;
	private BufferedReader reader;
	
	public Delimiter(String delimiter){
		this.delimiter = delimiter;
	}
	
	public void convertBufferToScanner(BufferedReader reader){
		this.scanner = new Scanner(reader);
		this.reader = reader;
	}

	public void searchForDelimiter() {
		scanner.useDelimiter(delimiter);
	}
	
	public BufferedReader getReader(){
		return this.reader;
	}
}
