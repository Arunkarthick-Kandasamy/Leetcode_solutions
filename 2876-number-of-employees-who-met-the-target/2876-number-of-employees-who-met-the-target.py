class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        result=0
        for i in hours:
            if target <= i:
                result+=1
        return result