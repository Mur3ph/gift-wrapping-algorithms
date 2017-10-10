package ie.murph.datastructure.hashing;

public class Hashing
{
    //Better to choose a prime number
    // 73 is the smallest prime congruent to 1 modulo 24. 73 is the 21st prime number, 37 is the 12th prime number
    // Binary: 21 = 10101, 73 = 1001001
    private int hash = 73;
    
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
