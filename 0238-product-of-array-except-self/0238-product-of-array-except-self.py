class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        mul = 1
        flag = 0
        for i in nums:
            if i == 0:
                flag = 1
                continue
            mul *= i

        if nums.count(0) > 1:
            return [0] * len(nums)

        result = []
        for i in nums:
            if i == 0:
                result.append(mul)
            elif flag == 1:
                result.append(0)
            else:
                result.append(mul // i)
        return result
