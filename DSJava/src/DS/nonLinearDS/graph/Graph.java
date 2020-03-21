package DS.nonLinearDS.graph;

import java.util.ArrayList;

public class Graph {

	int v;
	ArrayList<Integer> adjacency[];
	
	public Graph(int v) {
		this.v = v;
		
		adjacency = new ArrayList[v];
		
		for(int i=0; i<v; i++) {
			adjacency[i] = new ArrayList<Integer>();
		}
	}
	
	// Driver program to test above functions 
    public static void main(String args[]) 
    { 
        // create the graph given in above figure 
        int V = 5; 
        Graph graph = new Graph(V); 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 
       
        // print the adjacency list representation of  
        // the above graph 
        printGraph(graph); 
    } 
	
    // Adds an edge to an undirected graph 
    static void addEdge(Graph graph, int src, int dest) 
    { 
        // Add an edge from src to dest.  
        graph.adjacency[src].add(dest); 
          
        // Since graph is undirected, add an edge from dest 
        // to src also 
        graph.adjacency[dest].add(src); 
    } 
    
 // A utility function to print the adjacency list  
    // representation of graph 
    static void printGraph(Graph graph) 
    {        
        for(int v = 0; v < graph.v; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjacency[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } 
}
