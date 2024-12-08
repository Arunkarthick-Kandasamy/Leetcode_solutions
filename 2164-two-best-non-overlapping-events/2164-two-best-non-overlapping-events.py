class Solution:
    def maxTwoEvents(self, events):
        times = []
        for e in events:
            times.append([e[0], 1, e[2]])
            times.append([e[1] + 1, 0, e[2]])
        
        result, val = 0, 0
        times.sort()
        
        for t in times:
            if t[1]:
                result = max(result, t[2] + val)
            else:
                val = max(val, t[2])
        
        return result
