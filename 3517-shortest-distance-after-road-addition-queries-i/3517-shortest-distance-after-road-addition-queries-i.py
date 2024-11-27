class Solution:
    def __init__(self):
        self.graph = []

    def dijkstra(self, n: int) -> int:
        dist = [float('inf')] * n
        dist[0] = 0
        pq = [(0, 0)]  # (distance, node)
        
        while pq:
            cd, node = heapq.heappop(pq)
            if node == n - 1:
                return dist[n - 1]
            if cd > dist[node]:
                continue
            for nbr, wt in self.graph[node]:
                if cd + wt < dist[nbr]:
                    dist[nbr] = cd + wt
                    heapq.heappush(pq, (cd + wt, nbr))
        return dist[n - 1]

    def shortestDistanceAfterQueries(self, n: int, queries: List[List[int]]) -> List[int]:
        self.graph = [[] for _ in range(n)]
        for i in range(n - 1):
            self.graph[i].append((i + 1, 1))
        res = []
        for query in queries:
            self.graph[query[0]].append((query[1], 1))
            res.append(self.dijkstra(n))
        return res