class Validpath{
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        return dfs(source, destination, edges, visited);
    }

    boolean dfs(int node, int dest, int[][] edges, boolean[] visited) {
        if (node == dest) return true;

        visited[node] = true;

        for (int[] e : edges) {
            if (e[0] == node && !visited[e[1]])
                if (dfs(e[1], dest, edges, visited)) return true;

            if (e[1] == node && !visited[e[0]])
                if (dfs(e[0], dest, edges, visited)) return true;
        }

        return false;
    }
}