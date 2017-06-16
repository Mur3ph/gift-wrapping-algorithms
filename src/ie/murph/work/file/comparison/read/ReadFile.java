package ie.murph.work.file.comparison.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private String filename;
	private String currentLineOfDataFromFile;
	
	public ReadFile(String filename){
		this.filename = filename;
	}
	
	public void read(){
		try (BufferedReader reader = readEachLine()) {
			while (hasData(reader)) {
				System.out.println(printFileData());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private BufferedReader readEachLine(){
		return  new BufferedReader(readFile());
	}
	
	private FileReader readFile(){
		try {
			return new FileReader(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private boolean hasData(BufferedReader reader){
		try {
			return (currentLineOfDataFromFile = reader.readLine()) != null;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	private String printFileData(){
		return currentLineOfDataFromFile;
	}
}
