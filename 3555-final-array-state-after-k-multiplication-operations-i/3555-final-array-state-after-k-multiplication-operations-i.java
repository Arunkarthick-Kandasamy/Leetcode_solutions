class Solution {
    public int[] getFinalState(int[] nums, int k, int mul) {
        for(int i=0;i<k;i++)
        {
            int min=nums[0],ind=0;
            for(int j=1;j<nums.length;j++)
            {
                if(nums[j]<min)
                {
                    min=nums[j];
                    ind=j;
                }
            }
            nums[ind]=min*mul;

        }
    return nums;   
    }
}