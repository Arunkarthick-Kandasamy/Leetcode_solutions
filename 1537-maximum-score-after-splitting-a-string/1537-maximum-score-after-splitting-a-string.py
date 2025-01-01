class Solution:
    def maxScore(self, s: str) -> int:
        
        result=0
        for i in range(1,len(s)):
            count=0
            for j in s[:i]:
                if '0'==j:
                    count+=1
            for j  in s[i:]:
                if "1"==j:
                    count+=1
            result=max(count,result)
        return result

        