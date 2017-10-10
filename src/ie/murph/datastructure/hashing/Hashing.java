package ie.murph.datastructure.hashing;

public class Hashing
{
    //Better to choose a prime number
    private int hash = 7;
    
    public static void main(String[] args){
	Hashing hashing = new Hashing();
	
	System.out.println(hashing.hashString("Paul"));
	System.out.println(hashing.hashString("luaP"));
    }
    
    private int hashString(String userInput){
	int lenOfInput = userInput.length();
	for(int index = 0; index < lenOfInput; index++){
	    hash = hash*31 + userInput.charAt(index);
	}
	return hash;
    }
}
