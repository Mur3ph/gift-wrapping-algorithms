package ie.murph.datastructure.hashing.hashcode;

public class SimpleHashCode
{
    //Better to choose a prime number
    // 73 is the smallest prime congruent to 1 modulo 24. 73 is the 21st prime number, 37 is the 12th prime number
    // Binary: 21 = 10101, 73 = 1001001
    private int hash = 73;
    
    public void setHashString(String userInput){
	for(int index = 0; index < getLenghtOfUserInput(userInput); index++){
	    hash = calculateHashCode(userInput, index);
	}
    }
    
    private int getLenghtOfUserInput(String userInput){
	return userInput.length();
    }
    
    private int calculateHashCode(String userInput, int index){
	return hash*31 + userInput.charAt(index);
    }
    
    public int getHashString(){
	return hash;
    } 
}
