package ie.murph.datastructure.hashing;

import ie.murph.datastructure.hashing.hashcode.SimpleHashCode;

public class Hashing
{   
    public static void main(String[] args){
	SimpleHashCode simpleHash = new SimpleHashCode();
	
	simpleHash.setHashString("Paul");
	System.out.println(simpleHash.getHashString());
	
	simpleHash.setHashString("luaP");
	System.out.println(simpleHash.getHashString());
    }
}
