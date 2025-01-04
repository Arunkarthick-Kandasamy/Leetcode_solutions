class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        n=len(nums)
        arr=[False]*n
        for i in range(n):
            if arr[nums[i]]:
                return nums[i]
            arr[nums[i]]=True


        