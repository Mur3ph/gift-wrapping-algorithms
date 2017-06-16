package ie.murph.work.file.comparison.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	private String filename;
	
	public ReadFile(String filename){
		this.filename = filename;
	}
	
	public void read(){
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				System.out.println(currentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
