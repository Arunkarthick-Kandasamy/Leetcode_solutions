class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        f_sum=0
        for i in accounts:
            sum1=sum(i)
            if sum1>f_sum:
                f_sum=sum1
        return f_sum