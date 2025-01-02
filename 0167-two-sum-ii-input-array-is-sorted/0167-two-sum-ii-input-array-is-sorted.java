class Solution {
    public int[] twoSum(int[] n, int target) {
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length && n[i]+n[j]<=target;j++)
            {
                if(n[i]+n[j]==target)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
        
    }
}