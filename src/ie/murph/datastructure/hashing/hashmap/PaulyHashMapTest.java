package ie.murph.datastructure.hashing.hashmap;

public class PaulyHashMapTest
{
    public class RobsHashMapTest {
	 
	    private PaulyHashMap robsHashMap;
	    private final int NUM_ELEMENTS = 200000;
	 
	    @Before
	    public void setUp(){
	        robsHashMap = new PaulyHashMap();
	    }
	 
	    @Test
	    public void testHashMapPut(){
	        robsHashMap.put("Test1", "Test1Value");
	    }
	 
	    @Test
	    public void testPutGet(){
	        String k = "TestPutGet";
	        String v = "TestPutGetValue";
	        robsHashMap.put(k, v);
	        String valueResult = robsHashMap.get(k);
	        assertEquals(v, valueResult);
	    }
	 
	    @Test
	    public void testHashMapCollisions() {
	        /* Initialise hashmap */
	        for(int i = 0; i < NUM_ELEMENTS; i++){
	            robsHashMap.put(Integer.toString(i), Integer.toString(i));
	        }
	        /* Test all values of the get method */
	        for(int i = 0; i < NUM_ELEMENTS; i++){
	            String value = robsHashMap.get(Integer.toString(i));
	            assertEquals(Integer.toString(i), value);
	        }
	    }
	 
	    @After
	    public void tearDown(){
	        robsHashMap = null;
	    }
}
