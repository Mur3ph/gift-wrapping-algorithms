package ie.murph.datastructure.hashing.hashmap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PaulyHashMapTest
{
    private PaulyHashMap paulsHashMap;
    private final int NUM_ELEMENTS = 200000;

    @Before
    public void setUp()
    {
	paulsHashMap = new PaulyHashMap();
    }

    @Test
    public void testHashMapPut()
    {
	paulsHashMap.put("Test1", "Test1Value");
    }

    @Test
    public void testPutGet()
    {
	String k = "TestPutGet";
	String v = "TestPutGetValue";
	paulsHashMap.put(k, v);
	String valueResult = paulsHashMap.get(k);
	assertEquals(v, valueResult);
    }

    @Test
    public void testHashMapCollisions()
    {
	/* Initialise hashmap */
	for (int i = 0; i < NUM_ELEMENTS; i++)
	{
	    paulsHashMap.put(Integer.toString(i), Integer.toString(i));
	}
	/* Test all values of the get method */
	for (int i = 0; i < NUM_ELEMENTS; i++)
	{
	    String value = paulsHashMap.get(Integer.toString(i));
	    assertEquals(Integer.toString(i), value);
	}
    }

    @After
    public void tearDown()
    {
	paulsHashMap = null;
    }
}
