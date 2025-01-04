class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        n=list(set(arr))
        li=[]
        for i in n:
            temp=arr.count(i)
            if temp in li:
                return False
            li.append(temp)
        return True
        