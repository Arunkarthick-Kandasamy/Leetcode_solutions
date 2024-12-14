from collections import deque

class Solution:
    def continuousSubarrays(self, nums: List[int]) -> int:
        n = len(nums)
        left = 0
        count = 0
        min_q = deque()
        max_q = deque()

        for right in range(n):
            while min_q and nums[right] < min_q[-1]:
                min_q.pop()
            while max_q and nums[right] > max_q[-1]:
                max_q.pop()
            
            min_q.append(nums[right])
            max_q.append(nums[right])

            while max_q[0] - min_q[0] > 2:
                if nums[left] == min_q[0]:
                    min_q.popleft()
                if nums[left] == max_q[0]:
                    max_q.popleft()
                left += 1
            
            count += right - left + 1
        
        return count
