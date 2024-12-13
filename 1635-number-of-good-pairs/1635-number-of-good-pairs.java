class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int n=nums.length;
        int max=0;
        for(int i : nums)
        {
            if(max<i)
            {
                max=i;
            }
        }
        int[] check=new int[max+1];
        for(int i=0;i<n;i++)
        {
            count=count+check[nums[i]]++;
        }
        return count;        
    }
}