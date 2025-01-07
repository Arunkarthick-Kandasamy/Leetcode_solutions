class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len=arr.length-1;
        
        for(int i=0;i<=len && n>0;i++)
        {
            if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==len || arr[i+1]==0))
            {
                i++;
                n--;
            }
        }
        return n==0;
    }
}