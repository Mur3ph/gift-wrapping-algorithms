package ie.murph.resources;

public class ResourceForAlgorithmsToLearn {
	
	private final String GeeksforGeeksTopTenAlgorithms = "1). http://www.geeksforgeeks.org/top-10-algorithms-in-interview-questions/";
	private final String RosettaCodeProgrammingTasks = "2). http://rosettacode.org/wiki/Category:Programming_Tasks";
	
	public final String printTaskSheet(){
		return "\n" + GeeksforGeeksTopTenAlgorithms +
			   "\n" + RosettaCodeProgrammingTasks;
	}

}
