class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        count=0
        result=[]
        for i in range(len(A)):
            if A[i]==B[i]:
                count+=1
            if A[i] in B[:i]:
                count+=1 
            if B[i] in A[:i]:
                count+=1
            result.append(count)
        return result
        