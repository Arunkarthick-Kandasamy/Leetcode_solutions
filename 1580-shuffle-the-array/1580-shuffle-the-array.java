class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int k=1;
        int temp = nums[0];
        boolean flag=true;
        int[] result=new int[2*n];
        for(int i=0;i<(2*n);i++)
        {
            result[i]=temp;
            if(flag)
            {
                temp=nums[n+j];
                j++;
                flag=false;
            }
            else
            {
                temp=nums[k];
                k++;
                flag=true;
            }
        }
        return result;
    }
}