package ie.murph.datastructure.hashing.hashmap;

public class Node
{
    private String mapKey;
    private String mapValue;
    private Node nextNode;

    public Node()
    {
	
    }

    public Node(String mapKey, String mapValue)
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

    public Node getNextNode()
    {
	return nextNode;
    }

    public void setNextNode(Node nextNode)
    {
	this.nextNode = nextNode;
    }
}
