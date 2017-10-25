package ie.murph.datastructure.hashing.hashmap;

public class PaulyHashMap
{
    /* The initial size of the bucket array */
    private int SIZE_BUCKET_ARRAY = 256000;
    private HashMapNode[] hashMapNodeArray;
    private int hashcode;

    public PaulyHashMap()
    {
	hashMapNodeArray = new HashMapNode[SIZE_BUCKET_ARRAY];
    }

    public PaulyHashMap(int initialSize)
    {
	this.SIZE_BUCKET_ARRAY = initialSize;
	hashMapNodeArray = new HashMapNode[SIZE_BUCKET_ARRAY];
    }
    
    private HashMapNode[] getHashMapNodeArray()
    {
	return this.hashMapNodeArray;
    }

    /**
     * Used to put a key-value pair into the data structure.
     * 
     * @param key
     *            Key string that is used identify the key-value pair
     * @param value
     *            Value string in which the key string maps to.
     */
    public void putKeyAndValuePairIntoDataStructure(String key, String value)
    {
	/* Set the hash code */
	setHashCode(key);

	/* Create the Node to add to the linked list */
	HashMapNode entry = new HashMapNode(key, value);

	/* Insert the node to the bucket array at the hash index */
	if (getHashMapNodeArray()[hashcode] == null)
	{
	    /* No collision detected. Insert the node. */
	    insertHashMapNode(entry);
	} 
	else
	{
	    /*
	     * Collision detected. We must place the node at the end of the
	     * linked list.
	     */
	    collisionDetected(entry);
	}
    }

    private void setHashCode(String key)
    {
	this.hashcode = Math.abs(key.hashCode() % SIZE_BUCKET_ARRAY);
    }
    
    private void insertHashMapNode(HashMapNode entry)
    {
	getHashMapNodeArray()[hashcode] = entry;
    }

    private void collisionDetected(HashMapNode entry)
    {
	/*
	 * Collision detected. We must place the node at the end of the linked
	 * list.
	 */
	HashMapNode current = getHashMapNodeArray()[hashcode];
	while (current.getNextNode() != null)
	{
	    /* Check if the key already exists */
	    if (keyExists(current, entry))
	    {
		/* Replace the keys value with the new one */
		current.setMapValue(entry.getMapValue());
		return;
	    }
	    setHashMapNode(current);
	}
	/* When the code gets here current.next == null */
	/* Insert the node */
	current.setNextNode(entry);
    }

    private boolean keyExists(HashMapNode current, HashMapNode entry)
    {
	return current.getMapKey().equals(entry.getMapKey());
    }

    /**
     * Returns the value that is mapped to the give key.
     * 
     * @param key
     *            The key string which is used to search for the value it is
     *            mapped to.
     * @return The value string
     */
    public String getValueOfKey(String key)
    {
	/* Get the hash */
	int hashcode = generateHashCode(key);
	
	/* Search for key in linked list */
	HashMapNode hashMapNode = searchForKeyInLinkedList(hashcode);
	
	String value = searchLinkedListForValue(hashMapNode, key);
	
	return value;
    }

    private int generateHashCode(String key)
    {
	return Math.abs(key.hashCode() % SIZE_BUCKET_ARRAY);
    }
    
    private HashMapNode searchForKeyInLinkedList(int hashcode)
    {
	return getHashMapNodeArray()[hashcode];
    }
    
    private String searchLinkedListForValue(HashMapNode hashMapNode, String key)
    {
	/* Traverse linked list to find a value, find a position for insertion, etc. */
	while (hashMapNodeNotNull(hashMapNode))
	{
	    if (hashMapNodeExistsForGivenKey(hashMapNode, key))
	    {
		return hashMapNode.getMapValue();
	    }
	    setHashMapNode(hashMapNode);
	}
	/* Not found? then return null or empty string */
	return "".toString();
    }
    
    private boolean hashMapNodeNotNull(HashMapNode hashMapNode)
    {
	return hashMapNode != null;
    }
    
    private boolean hashMapNodeExistsForGivenKey(HashMapNode hashMapNode, String key)
    {
	return hashMapNode.getMapKey().equals(key);
    }
    
    private void setHashMapNode(HashMapNode hashMapNode)
    {
	hashMapNode = hashMapNode.getNextNode();
    }

}
