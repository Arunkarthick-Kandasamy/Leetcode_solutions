class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        prod=1
        sum1=0
        while 0<n:
            prod=(n%10)*prod
            sum1=(n%10)+sum1
            n=int(n/10)
        return prod-sum1
        