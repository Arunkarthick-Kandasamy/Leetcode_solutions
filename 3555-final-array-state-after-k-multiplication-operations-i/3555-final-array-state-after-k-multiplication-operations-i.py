class Solution:
    def getFinalState(self, nums: List[int], k: int, mul: int) -> List[int]:
        for i in range(k):
            min=nums[0]
            ind=0
            for j in range(1,len(nums)):
                if nums[j]<min:
                    min=nums[j]
                    ind=j
            nums[ind]*=mul
        return nums

        