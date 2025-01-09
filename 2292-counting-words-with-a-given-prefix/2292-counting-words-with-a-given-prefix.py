class Solution:
    def prefixCount(self, w: List[str], p: str) -> int: # w ;: words , p : pref
        cnt=0 # cnt = count
        for i in w: # i : interation of each words
            if i.startswith(p):
                cnt+=1
        return cnt
        