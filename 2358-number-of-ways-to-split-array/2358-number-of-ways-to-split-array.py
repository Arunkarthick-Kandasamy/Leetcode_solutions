class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        add=sum(nums)
        count, result=0, 0
        for i in range(0,len(nums)-1):
            result+=nums[i]
            add-=nums[i]
            if result>=add:
                count+=1
        return count

        