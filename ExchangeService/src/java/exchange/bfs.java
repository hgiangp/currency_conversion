package exchange; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.Iterator; 
import java.util.Hashtable; 
// Read file 
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
 
// A class to store a graph edge
class Edge
{
    public final int source, dest;
    public final double weight; 
 
    private Edge(int source, int dest, double weight)
    {
        this.source = source;
        this.dest = dest;
        this.weight = weight; 

    }
 
    // Factory method for creating an immutable instance of `Edge`
    public static Edge of(int a, int b, double c) {
        return new Edge(a, b, c);        // calls private constructor
    }
}
 
// A class to represent a graph object
class Graph
{
    // A list of lists to represent an adjacency list
    List<List<Integer>> adjList = null;
    double [][] weightList; 
 
    // Constructor
    Graph(List<Edge> edges, int n)
    {
        weightList = new double[n][n]; 
        
        adjList = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
 
        // add edges to the directed graph
        for (Edge edge: edges) {
            adjList.get(edge.source).add(edge.dest);
            weightList[edge.source][edge.dest] = edge.weight; 
        }
    }
}
 
class BFS
{
    public static Graph graph; 
    public static int no_nodes; 
    static Hashtable<String, Integer> my_dict; 
    
    public static void initHashTable() 
    {
        my_dict = new Hashtable<String, Integer>();
        my_dict.put("USD", 0);
        my_dict.put("JPY", 1);
        my_dict.put("EUR", 2);
        my_dict.put("CNY", 3);
        my_dict.put("KRW", 4); 
    }
    BFS() 
    {
        initHashTable(); 
        List<Edge> edges = new ArrayList<Edge>();
        
        String fileName = "data.txt";
        try {
            URI uri = Objects.requireNonNull(this.getClass().getResource(fileName)).toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri),
                    Charset.defaultCharset());

            for (String line : lines) {
                String[] arrOfStr = line.split(" ", 3);
                int src = my_dict.get(arrOfStr[0]); 
                int dst = my_dict.get(arrOfStr[1]);
                double weight = Double.valueOf(arrOfStr[2]);  
                edges.add(Edge.of(src, dst, weight)); 
                System.out.println("src " + src + " dst " + dst + " weight " + Double.valueOf(arrOfStr[2])); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.no_nodes = 5;
 
        // build a graph from the given edges
        this.graph = new Graph(edges, this.no_nodes);

    }
    // Function to perform DFS traversal in a directed graph to find the
    // complete path between source and destination vertices
    public static boolean isReachable(int src, int dest,
                            boolean[] discovered, Stack<Integer> path)
    {
        // mark the current node as discovered
        discovered[src] = true;
        // include the current node in the path
        path.add(src);
 
        // if destination vertex is found
        if (src == dest) {
            return true;
        }
 
        // do for every edge (src, i)
        for (int i: graph.adjList.get(src))
        {
            // if `u` is not yet discovered
            if (!discovered[i])
            {
                // return true if the destination is found
                if (isReachable(i, dest, discovered, path)) {
                    return true;
                }
            }
        }
 
        // backtrack: remove the current node from the path
        path.pop();
 
        // return false if destination vertex is not reachable from src
        return false;
    }

    public static double getRate(Stack<Integer> path)
    {
                // 1. Using an iterator to iterate through a stack
        Iterator<Integer> itr = path.iterator();
        double rate = 1.0; 
        int src, dst = itr.next(); 
        
        // hasNext() returns true if the stack has more elements
        while (itr.hasNext())
        {
            src = dst; 
            dst = itr.next(); 
            // next() returns the next element in the iteration

            rate *= graph.weightList[src][dst]; 
            System.out.println("src = " + src + " dest " + dst + " rate = " + rate);
        }
        return rate; 
    }

    public double getCurrencyRate(int src, int dest) 
    {
        // To store the complete path between source and destination
        Stack<Integer> path = new Stack<>();
        boolean[] discovered = new boolean[this.no_nodes]; 

        double rate = 0.0; 
 
        // perform DFS traversal from the source vertex to check the connectivity
        // and store path from the source vertex to the destination vertex
        if (isReachable(src, dest, discovered, path))
        {
            System.out.println("Path exists from vertex " + src + " to vertex " + dest);
            System.out.println("The complete path is " + path);
            rate = getRate(path); 
        }
        else {
            System.out.println("No path exists between vertices " + src +
                    " and " + dest);
        }
        return rate; 
    }

    public double getCurrencyRate(String src, String dst) 
    {
        int src_int = my_dict.get(src); 
        int dst_int = my_dict.get(dst); 

        return getCurrencyRate(src_int, dst_int); 
    }

 
    public static void main(String[] args)
    {
        BFS bfs = new BFS(); 
        bfs.getCurrencyRate("JPY", "KRW"); 
    }
}