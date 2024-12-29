class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum1=0;
        while(0<n)
        {
            prod=prod*(n%10);
            sum1=sum1+(n%10);
            n=n/10;
        }
        return prod-sum1;        
    }
}