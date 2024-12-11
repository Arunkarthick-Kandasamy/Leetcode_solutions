class Solution:
    def maximumBeauty(self, nums: List[int], k: int) -> int:
        nums.sort()
        left = 0
        for right in range(len(nums)):
            mid = (nums[left] + nums[right]) // 2
            if mid - nums[left] <= k and nums[right] - mid <= k:
                continue
            left += 1
        return right - left + 1
        