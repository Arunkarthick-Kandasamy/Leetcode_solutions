class Solution {
    public boolean check(int[] nums) {
        int i;
        boolean flag=true;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(flag)
                    flag=false;
                else
                    return false;
            }
        }
        if(! flag && nums[i]>nums[0])
        {
            return false;
        }
        return true;
        
    }
}