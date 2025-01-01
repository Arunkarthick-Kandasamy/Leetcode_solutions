class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        result=gain[0]
        for i in range(1,len(gain)):
            gain[i]+=gain[i-1]
            result=max(gain[i],result)
        return max(0,result)
        