class Solution:
    def reverseVowels(self, s: str) -> str:
        vow=""
        for i in s:
            if i in 'aeiouAEIOU':
                vow+=i
        j=len(vow)-1
        result=""
        for i in range(0,len(s)):
            if s[i] in 'aeiouAEIOU':
                result+=vow[j]
                j-=1
            else:
                result+=s[i]
        return result

        