class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        add=sum(nums[:k])
        result=add/k
        for i in range(k,len(nums)):
            print(result)
            add-=nums[i-k]
            add+=nums[i]
            result=max(result,add/k)
        return result