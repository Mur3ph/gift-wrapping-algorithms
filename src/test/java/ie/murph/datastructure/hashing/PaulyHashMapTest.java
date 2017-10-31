package test.java.ie.murph.datastructure.hashing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.ie.murph.datastructure.hashing.hashmap.PaulyHashMap;

public class PaulyHashMapTest
{
    private PaulyHashMap paulsHashMap;
    private final int NUM_ELEMENTS = 10000; // 200000: Slowed the algorithm down, use to run faster, a lot faster with this number of elements
    					    // Changing SIZE_BUCKET_ARRAY variable in PaulyHashMap class caused this to slow ALOT
    @Before
    public void setUp()
    {
	paulsHashMap = new PaulyHashMap();
    }

    @Test
    public void testHashMapPut()
    {
	paulsHashMap.putKeyAndValuePairIntoDataStructure("Test1", "Test1Value");
    }

    @Test
    public void testPutGet()
    {
	String k = "TestPutGet";
	String v = "TestPutGetValue";
	paulsHashMap.putKeyAndValuePairIntoDataStructure(k, v);
	String valueResult = paulsHashMap.getValueOfKey(k);
	assertEquals(v, valueResult);
    }

    @Test
    public void testHashMapCollisions()
    {
	/* Initialise hashmap */
	for (int i = 0; i < NUM_ELEMENTS; i++)
	{
	    paulsHashMap.putKeyAndValuePairIntoDataStructure(Integer.toString(i), Integer.toString(i));
	}
	/* Test all values of the get method */
	for (int i = 0; i < NUM_ELEMENTS; i++)
	{
	    String value = paulsHashMap.getValueOfKey(Integer.toString(i));
	    assertEquals(Integer.toString(i), value);
	}
    }

    @After
    public void tearDown()
    {
	paulsHashMap = null;
    }
}
