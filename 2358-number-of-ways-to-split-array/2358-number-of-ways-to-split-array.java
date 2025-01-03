class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int count = 0;
        long l_sum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            l_sum+=nums[i];
            sum-=nums[i];
            if(l_sum>=sum)
                count++;
        }
        return count;
    }
}