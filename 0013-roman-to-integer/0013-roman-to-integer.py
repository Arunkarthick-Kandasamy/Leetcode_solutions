class Solution:
    def romanToInt(self, s):
        r={"M":1000,"D":500,"C":100,"L":50,"X":10,"V":5,"I":1}
        result=0
        for i in range(len(s)-1):
            if r[s[i]]<r[s[i+1]]:
                result-=r[s[i]]
            else:
                result+=r[s[i]]
        result+=r[s[len(s)-1]]
        return result
        