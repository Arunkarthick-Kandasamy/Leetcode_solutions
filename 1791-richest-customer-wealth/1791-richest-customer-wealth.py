class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        f_sum=0
        for i in accounts:
            if sum(i)>f_sum:
                f_sum=sum(i)
        return f_sum