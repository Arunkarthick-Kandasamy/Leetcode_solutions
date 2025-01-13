class Solution:
    def minimumLength(self, s: str) -> int:
        n=len(s)
        se=set(s)
        for i in se:
            k=s.count(i)
            n-=k
            if k%2==0:
                n+=2
            else:
                n+=1
        return n
            
            


        