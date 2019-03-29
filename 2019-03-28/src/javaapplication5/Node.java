package javaapplication5;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String buildingName;
    List<Node> nodes = new ArrayList<>();

    public List<Node> getNodes()
    {
        return nodes;
    }
    
    public Node(String name)
    {
        this.buildingName = name;
    }
    
    public void addNode(Node node)
    {
        nodes.add(node);
    }
    
    public void setName(String name)
    {
        this.buildingName = name;
    }
    
    public Node getNode(int i)
    {
        return nodes.get(i);
    }
    
    public String getName()
    {
        return buildingName;
    }
}
