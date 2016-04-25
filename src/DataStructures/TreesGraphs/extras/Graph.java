package DataStructures.TreesGraphs.extras;

import java.util.ArrayList;

/**
 * Created by gime on 4/25/2016.
 */
public class Graph {

    class Adjacent extends ArrayList<Integer> {

    }

    public int n,m;
    public Adjacent[] adj;
    public boolean[] visited;

    public Graph(int n) {
        adj = new Adjacent[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new Adjacent();
            visited[i] = false;
        }
    }

    public void addEdge(int a, int b) {
        adj[a].add(b);
    }

    public void visit(int a) {
        visited[a] = true;
    }

    public ArrayList<Integer> getAdjacentArray(int a) {
        return adj[a];
    }
}
