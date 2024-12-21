class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        double result=sum/k;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            double avg=sum/k;
            if(result<avg)
            {
                result=avg;
            }
        }
        return result;
    }
}