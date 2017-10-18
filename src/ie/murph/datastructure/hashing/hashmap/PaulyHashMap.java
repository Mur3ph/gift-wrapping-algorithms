package ie.murph.datastructure.hashing.hashmap;

public class PaulyHashMap
{
    /* The initial size of the bucket array */
    private int BUCKET_ARRAY_SIZE = 256;
    private HashMapNode bucketArray[] = new HashMapNode[BUCKET_ARRAY_SIZE];
    private int hashcode;

    /* Constructors */
    public PaulyHashMap()
    {
    }

    public PaulyHashMap(int initialSize)
    {
	this.BUCKET_ARRAY_SIZE = initialSize;
    }

    /**
     * Used to put a key-value pair into the data structure.
     * 
     * @param key
     *            Key string that is used identify the key-value pair
     * @param value
     *            Value string in which the key string maps to.
     */
    public void put(String key, String value)
    {
	/* Set the hash code */
	setHashCode(key);

	/* Create the Node to add to the linked list */
	HashMapNode entry = new HashMapNode(key, value);

	/* Insert the node to the bucket array at the hash index */
	if (bucketArray[hashcode] == null)
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
	this.hashcode = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
    }
    
    private void insertHashMapNode(HashMapNode entry)
    {
	bucketArray[hashcode] = entry;
    }

    private void collisionDetected(HashMapNode entry)
    {
	/*
	 * Collision detected. We must place the node at the end of the linked
	 * list.
	 */
	HashMapNode current = bucketArray[hashcode];
	while (current.getNextNode() != null)
	{
	    /* Check if the key already exists */
	    if (keyExists(current, entry))
	    {
		/* Replace the keys value with the new one */
		current.setMapValue(entry.getMapValue());
		return;
	    }
	    current = current.getNextNode();
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
    public String get(String key)
    {
	/* Get the hash */
	int hashcode = generateHashCode(key);
	
	/* Search for key in linked list */
	HashMapNode hashMapNode = searchForKeyInLinkedList(hashcode);
	
	/* Traverse linked list */
	while (hashMapNodeExists(hashMapNode))
	{
	    if (isBothParametersEqual(hashMapNode, key))
	    {
		return hashMapNode.getMapValue();
	    }
	    hashMapNode = hashMapNode.getNextNode();
	}
	/* Not found? then return null */
	return null;
    }

    private int generateHashCode(String key)
    {
	return Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
    }
    
    private HashMapNode searchForKeyInLinkedList(int hashcode)
    {
	return bucketArray[hashcode];
    }
    
    private boolean hashMapNodeExists(HashMapNode hashMapNode)
    {
	return hashMapNode != null;
    }
    
    private boolean isBothParametersEqual(HashMapNode hashMapNode, String key)
    {
	return hashMapNode.getMapKey().equals(key);
    }

}
