class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        add=sum(nums)
        count, result=0, 0
        nums.pop()
        for i in nums:
            result+=i
            add-=i
            if result>=add:
                count+=1
        return count

        