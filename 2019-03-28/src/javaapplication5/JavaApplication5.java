package javaapplication5;

import java.util.ArrayList;
import java.util.List;

public class JavaApplication5
{
    public static List<Node> visited = new ArrayList<>();
    
    public static void main(String[] args)
    {
        // Create our "buildings" (nodes/vertices)
        Node meshel = new Node("Meshel Hall");
        Node lincoln = new Node("Lincoln Building");
        Node wb = new Node("Ward Beecher Hall");
        Node maag = new Node("Maag Library");
        
        // Add destinations (edges)
        meshel.addNode(maag);
        
        maag.addNode(meshel);
        maag.addNode(lincoln);
        maag.addNode(wb);
        
        lincoln.addNode(maag);
        lincoln.addNode(wb);
        
        wb.addNode(maag);
        wb.addNode(lincoln);
        
        // Visit our first builing, then visit all others recursively.
        visitNode(meshel);
    }
    
    public static void visitNode(Node start)
    {
        // Add the current building to our "visited" list.  This allows us
        // to avoid going to the same building twice and getting stuck in
        // an infinite loop if there's a cycle in the graph (example: A can
        // go to B, and B can also go to A--or a more complicated cyclic route).
        visited.add(start);
        
        for(Node destination : start.getNodes())
        {
            // Print out where we're at and the destinations we can reach.
            System.out.println(start.getName() 
                    + " -> " + destination.getName());
            
            // If we've already visited the node, don't visit it again.
            if(!visited.contains(destination))
            {
                visitNode(destination);
            }
        }
    }
}
