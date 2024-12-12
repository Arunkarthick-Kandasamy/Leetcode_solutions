class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        n=int(len(nums)/2)
        result=[]
        for i in range(n):
            a=min(nums)
            nums.remove(a)
            b=min(nums)
            nums.remove(b)
            result.append(b)
            result.append(a)


        return result