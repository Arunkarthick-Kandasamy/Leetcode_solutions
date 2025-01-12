class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        result=s[0]
        for i in range(len(s)):
            for j in range(i+1,len(s)):
                st=s[i:j+1]
                if st==st[::-1] and len(st)>len(result):
                    result=st
        return result


        