class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int sum=0;
        if(n1 % 2 ==0 && n2 % 2 ==0)
        {
            return 0;
        }
        else if(n1 % 2 ==0 && n2 % 2 == 1)
        {
            for(int i=0;i<n1;i++)
            {
                sum=sum^nums1[i];
            }
        }
        else if(n1 % 2 == 1 && n2 % 2 == 0)
        {
            for(int i=0;i<n2;i++)
            {
                sum=sum^nums2[i];
            }
        }
        else
        {
            for(int i=0;i<n1;i++)
            {
                sum=sum^nums1[i];
            }
            for(int i=0;i<n2;i++)
            {
                sum=sum^nums2[i];
            }
        }
        return sum;
    }
}