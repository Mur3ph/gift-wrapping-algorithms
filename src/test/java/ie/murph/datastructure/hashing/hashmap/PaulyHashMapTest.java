package test.java.ie.murph.datastructure.hashing.hashmap;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.ie.murph.datastructure.hashing.hashmap.PaulyHashMap;

public class PaulyHashMapTest {
	private PaulyHashMap paulyHashMap;
	private final int NUMBER_OF_KEY_VALUE_ELEMENTS = 10000; // 200000: Slowed the algorithm
											// down, use to run faster, a lot
											// faster with this number of
											// elements
	// Changing SIZE_BUCKET_ARRAY variable in PaulyHashMap class caused this to
	// slow ALOT

	@Before
	public void setUp() {
		paulyHashMap = new PaulyHashMap();
	}

	@Test
	public void testHashMapPut() {
		paulyHashMap.putKeyAndValuePairIntoDataStructure("Test1Key", "Test1Value");
	}

	@Test
	public void testPutGetMethods() {
		String key = "TestPutGetKey";
		String value = "TestPutGetValue";
		paulyHashMap.putKeyAndValuePairIntoDataStructure(key, value);
		String valueResult = paulyHashMap.getValueOfKey(key);
		assertEquals(value, valueResult);
	}

	@Test
	public void testHashMapCollisions() {
		/* Initialise hashmap */
		for (int i = 0; i < NUMBER_OF_KEY_VALUE_ELEMENTS; i++) {
			paulyHashMap.putKeyAndValuePairIntoDataStructure(Integer.toString(i), Integer.toString(i));
		}
		/* Test all values of the get method */
		for (int i = 0; i < NUMBER_OF_KEY_VALUE_ELEMENTS; i++) {
			String value = paulyHashMap.getValueOfKey(Integer.toString(i));
			assertEquals(Integer.toString(i), value);
		}
	}

	@After
	public void tearDown() {
		paulyHashMap = null;
	}
}
