class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        n=list(set(nums))
        result=[]
        for i in n:
            if nums.count(i)==1:
                result.append(i)
        return result
        