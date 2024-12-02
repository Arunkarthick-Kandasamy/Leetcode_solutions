class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result=[]
        for i in candies:
            result.append(i+extraCandies>=max(candies))
        return result
        