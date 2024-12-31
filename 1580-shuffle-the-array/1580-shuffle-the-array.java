class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int k=1;
        int temp = nums[0];
        boolean flag=true;
        int[] result=new int[2*n];
        for(int i=0;i<n;i++)
        {
            result[j]=nums[i];
            result[k]=nums[i+n];
            k+=2;
            j+=2;
        }
        return result;
    }
}