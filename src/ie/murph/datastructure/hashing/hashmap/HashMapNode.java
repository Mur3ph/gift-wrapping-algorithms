package ie.murph.datastructure.hashing.hashmap;

public class HashMapNode
{
    private String mapKey;
    private String mapValue;
    private HashMapNode nextNode;

    public HashMapNode()
    {
	
    }

    public HashMapNode(String mapKey, String mapValue)
    {
	this.mapKey = mapKey;
	this.mapValue = mapValue;
    }

    public String getMapKey()
    {
	return mapKey;
    }

    public void setMapKey(String mapKey)
    {
	this.mapKey = mapKey;
    }

    public String getMapValue()
    {
	return mapValue;
    }

    public void setMapValue(String mapValue)
    {
	this.mapValue = mapValue;
    }

    public HashMapNode getNextNode()
    {
	return nextNode;
    }

    public void setNextNode(HashMapNode nextNode)
    {
	this.nextNode = nextNode;
    }
}
