class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr=new boolean[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            if(arr[nums[i]-1])
            {
                return nums[i];
            }
            arr[nums[i]-1]=true;
        }
       return -1; 
    }
}