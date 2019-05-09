package main.java.ie.murph.work.interview.cr2;

public class CR22 {
	
	public static void main(String[] args)
	{
		CR22 cr = new CR22();
		System.out.println(cr.reverseText("Navan"));
		System.out.println(cr.reverseTextWithStringBuilder("Navan"));
	}

	public String reverseText(String text){
		String reversedText = "";
		int lastPosition = text.length()-1;
		for(int iteration = lastPosition; iteration >= 0; iteration--){
			reversedText += text.charAt(iteration);
		}
		return reversedText;
	}
	
	public String reverseTextWithStringBuilder(String text){
		return new StringBuilder(text).reverse().toString();
	}
	
}
