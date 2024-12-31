class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        result=[0]*len(nums)
        for i in range(0,len(nums)):
            for j in range(0,len(nums)):
                if(i != j and nums[j]<nums[i]):
                    result[i]+=1
        return result