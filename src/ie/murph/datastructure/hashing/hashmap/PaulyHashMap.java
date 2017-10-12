package ie.murph.datastructure.hashing.hashmap;

public class PaulyHashMap
{
    /* The initial size of the bucket array */
    private int BUCKET_ARRAY_SIZE = 256;
    private Node bucketArray[] = new Node[BUCKET_ARRAY_SIZE];

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
	/* Get the hash code */
	int hash = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
	/* Create the Node to add to the linked list */
	Node entry = new Node(key, value);

	/* Insert the node to the bucket array at the hash index */
	if (bucketArray[hash] == null)
	{
	    /* No collision detected. Insert the node. */
	    bucketArray[hash] = entry;
	} else
	{
	    /*
	     * Collision detected. We must place the node at the end of the
	     * linked list.
	     */
	    Node current = bucketArray[hash];
	    while (current.getNext() != null)
	    {
		/* Check if the key already exists */
		if (current.getKey().equals(entry.getKey()))
		{
		    /* Replace the keys value with the new one */
		    current.setValue(entry.getValue());
		    return;
		}
		current = current.getNext();
	    }
	    /* When the code gets here current.next == null */
	    /* Insert the node */
	    current.setNext(entry);
	}
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
	int hash = Math.abs(key.hashCode() % BUCKET_ARRAY_SIZE);
	/* Search for key in linked list */
	Node n = bucketArray[hash];
	/* Traverse linked list */
	while (n != null)
	{
	    if (n.getKey().equals(key))
	    {
		return n.getValue();
	    }
	    n = n.getNext();
	}
	/* Not found? then return null */
	return null;
    }
}
