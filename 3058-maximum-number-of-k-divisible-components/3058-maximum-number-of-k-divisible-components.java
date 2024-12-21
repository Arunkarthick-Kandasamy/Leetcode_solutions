import java.util.*;

class Solution {
    private Map<Integer, List<Integer>> adj;
    private int comp;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        adj = new HashMap<>();
        comp = 0;

        int src = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u, k1 -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k1 -> new ArrayList<>()).add(u);
        }

        dfs(src, -1, values, k);
        return comp;
    }

    private int dfs(int root, int parent, int[] values, int k) {
        int ans = values[root];

        for (int neigh : adj.getOrDefault(root, Collections.emptyList())) {
            if (parent != neigh) {
                ans += dfs(neigh, root, values, k);
            }
        }

        if (ans % k == 0) {
            comp++;
            return 0;
        }

        return ans % k;
    }
}