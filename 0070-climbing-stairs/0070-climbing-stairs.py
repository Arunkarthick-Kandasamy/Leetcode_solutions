class Solution:
    def climbStairs(self, n: int) -> int:
        i=0
        j=1
        while(n!=0):
            i , j = j , i+j
            n-=1
        return j
     