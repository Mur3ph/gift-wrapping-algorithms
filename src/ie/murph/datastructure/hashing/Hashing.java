package ie.murph.datastructure.hashing;

import java.util.HashMap;
import java.util.Map;

import ie.murph.datastructure.hashing.hashcode.SimpleHashCode;
import ie.murph.datastructure.hashing.hashmap.PaulyHashMap;

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
	String k = "TestPutGet";
	String v = "TestPutGetValue";
	paulsHashMap.putKeyAndValuePairIntoDataStructure(k, v);
	String valueResult = paulsHashMap.getValueOfKey(k);
	System.out.println("\nPauly: " + valueResult);
	
	Map<String, String> javaHashmap = new HashMap<String, String>();
	javaHashmap.put(k, v);      
	String javaValueResult = javaHashmap.get(k);
	System.out.println("\nJavy: " + javaValueResult);
    }
}
