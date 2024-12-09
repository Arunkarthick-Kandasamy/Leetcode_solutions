class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result=new boolean[queries.length];
        int k=0;
        int[] parity = new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            parity[i]=parity[i-1];
            if(nums[i]%2==nums[i-1]%2)
            {
                parity[i]++;
            }
        }
        for(int[] i : queries)
        {
            if(parity[i[0]]==parity[i[1]])
            {
                result[k]=true;
                
            }
            else
                result[k]=false;

            k++;
        }
        return result;
        
    }
}