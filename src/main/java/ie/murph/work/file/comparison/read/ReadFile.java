package main.java.ie.murph.work.file.comparison.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import main.java.ie.murph.work.file.comparison.delimiter.Delimiter;

public class ReadFile {

	private String filename;
	private String currentLineOfDataFromFile;
	private Delimiter delimiter;
	
	public ReadFile(String filename, Delimiter delimiter){
		this.filename = filename;
		this.delimiter = delimiter;
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
		delimiter.convertBufferToScanner(new BufferedReader(readFile()));
		delimiter.searchForDelimiter();
		return  delimiter.getReader();
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
