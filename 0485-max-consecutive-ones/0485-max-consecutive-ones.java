class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                count+=1;
            else
                count=0;
            if(result<count)
                result=count;
        }
        return result;
        
    }
}