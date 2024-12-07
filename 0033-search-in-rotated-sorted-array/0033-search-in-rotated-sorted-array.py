class Solution:
    def search(self, nums: List[int], target: int) -> int:
        for i in range(math.ceil(len(nums)/2)):
            if nums[i]==target:
                return i
            if nums[len(nums)-i-1]==target:
                return len(nums)-i-1
        return -1
        