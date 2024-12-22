class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        num=0
        for i in digits:
            num=(num*10)+i
        num+=1
        result=[]
        while((num)>0):
            result.append(num%10)
            num//=10
        return result[::-1]
