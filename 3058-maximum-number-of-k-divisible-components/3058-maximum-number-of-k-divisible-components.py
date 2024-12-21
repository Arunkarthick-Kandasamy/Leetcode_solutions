class Solution:
    def maxKDivisibleComponents(self, n: int, edges: List[List[int]], values: List[int], k: int) -> int:
        adj = defaultdict(list)
        src = 0
        for u,v in edges:
            adj[u].append(v)
            adj[v].append(u)
        comp = 0
        def dfs(root,parent):
            nonlocal comp
            ans = values[root]
            for neigh in adj[root]:
                if parent != neigh:
                    ans += dfs(neigh,root)
            if ans % k == 0:
                comp += 1
                return 0
            return ans % k
        dfs(src,-1)
        return comp