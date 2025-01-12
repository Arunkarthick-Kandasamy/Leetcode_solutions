class Solution:
    def canBeValid(self, s: str, locked: str) -> bool:
        if len(s)%2 != 0:
            return False
        count=0
        for i,j in zip(s,locked):
            if i=='(' or j=='0':
                count+=1
            elif i==')':
                count-=1
            if count<0:
                return False
        count=0
        for i,j in zip(s[::-1],locked[::-1]):
            if i==')' or j=='0':
                count+=1
            elif i=='(':
                count-=1
            if count<0:
                return False
        return True
        
        