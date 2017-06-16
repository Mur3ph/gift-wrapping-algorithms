package ie.murph.work.file.comparison;

public class RunFileComparison {
	private static final String DATA_FILENAME = "data/test-data.txt";
	
	public static void main(String[] args){
		ReadFile readFile = new ReadFile(DATA_FILENAME);
		readFile.read();
	}
}
