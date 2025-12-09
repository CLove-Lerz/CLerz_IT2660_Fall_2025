class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
      String[] vertices = {"Liberal Arts", "Student Services", "Health Careers & Sciences", "Health Technologies Center", "Recreation Center", "Technology Learning Center", "Business & Technology", "Theatre"};

    // 2-Define Edges
      int[] [] edges = {
        {0,1}, {0,7},
        {1,0}, {1,4}, {1,5}, {1,6},
        {2,3}, {2,4},
        {3,2},
        {4,1}, {4,2},
        {5,1},
        {6,1}, {6,7},
        {7,0}, {7,6}

      };

    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(vertices, edges);
    
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    int startIndex = graph.getIndex("Business & Technology");
    System.out.println("\nDepth-First Search (DFS) starting at \"Business & Technology\" (Index " + startIndex + "):");

    UnweightedGraph<String>.SearchTree dfsTree = graph.dfs(startIndex);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("\n*** DFS Search Order ***");
    System.out.println(dfsTree.getSearchOrder().stream()
      .map(i -> graph.getVertex(i))
      .collect(java.util.stream.Collectors.joining(", ")));

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("\n*** Parent-Child Relationships (DFS Tree Edges) ***");
    for (int i = 0; i < graph.getSize(); i++) { // Loop through all vertices
    int parentIndex = dfsTree.getParent(i); // Correctly call the method with an argument
    if (parentIndex != -1) { // Check the parent index
        System.out.println("Parent: " + graph.getVertex(parentIndex) + " -> Child: " + graph.getVertex(i));
    }
}
   
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    System.out.println("\n*** Paths from Business & Technology ***");
    int htcIndex = graph.getIndex("Health Technologies Center");
    if (htcIndex != -1) dfsTree.printPath(htcIndex);
    int ssIndex = graph.getIndex("Student Services");
    if (ssIndex != -1) dfsTree.printPath(ssIndex);
    int rcIndex = graph.getIndex("Recreation Center");
    if (rcIndex != -1) dfsTree.printPath(rcIndex);

     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
     System.out.println("\n*** Full DFS Tree Structure ***");
    dfsTree.printTree();
    
  }
}