package DataStructures.TreesGraphs;

import DataStructures.TreesGraphs.extras.Graph;

import java.util.ArrayList;

/**
 * Created by gime on 4/25/2016.
 */
public class CheckIfRouteExistsInGraph {

    private static Graph graph;

    private static void dfs(int v, int tail) {
        graph.visit(v);
        if (graph.visited[tail]) return;
        ArrayList<Integer> adj = graph.getAdjacentArray(v);
        for (int i = 0; i < adj.size(); i++) {
            if (!graph.visited[adj.get(i)])
                dfs(adj.get(i), tail);
        }
    }

    private static boolean pathExists(int a, int b) {
        dfs(a, b);
        return graph.visited[b];
    }

    public static void main(String[] args) {
        graph = new Graph(5);
        if (pathExists(0,5)) System.out.println("there is a path");
    }

}
