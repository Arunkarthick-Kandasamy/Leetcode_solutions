class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        lis1=nums[0:n]
        lis2=nums[n:2*n]
        result=[]
        for i in range(n):
            result.append(lis1[i])
            result.append(lis2[i])
        return result

        