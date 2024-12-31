class Solution:
    def countMatches(self, items: List[List[str]], key: str, val: str) -> int:
        count = 0
        if key =="type":
            j=0
        elif key =="color":
            j=1
        else:
            j=2
        for i in items:
            if val == i[j]:
                count+=1
        return count
        