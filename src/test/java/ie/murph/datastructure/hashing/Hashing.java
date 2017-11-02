package test.java.ie.murph.datastructure.hashing;

import java.util.HashMap;
import java.util.Map;

import main.java.ie.murph.datastructure.hashing.hashcode.SimpleHashCode;
import main.java.ie.murph.datastructure.hashing.hashmap.PaulyHashMap;

public class Hashing
{   
    public static void main(String[] args){
	
	System.out.println("\nHashcode");
	SimpleHashCode simpleHash = new SimpleHashCode();
	
	simpleHash.setHashString("Paul");
	System.out.println(simpleHash.getHashString());
	
	simpleHash.setHashString("luaP");
	System.out.println(simpleHash.getHashString());
	
	System.out.println("");
	System.out.println("\nHashmap");
	
	PaulyHashMap paulsHashMap = new PaulyHashMap();
	String key = "TestPutGet";
	String value = "TestPutGetValue";
	paulsHashMap.putKeyAndValuePairIntoDataStructure(key, value);
	String valueResult = paulsHashMap.getValueOfKey(key);
	System.out.println("\nPauly: " + valueResult);
	
	Map<String, String> javaHashmap = new HashMap<String, String>();
	javaHashmap.put(key, value);      
	String javaValueResult = javaHashmap.get(key);
	System.out.println("\nJavy: " + javaValueResult);
    }
}
