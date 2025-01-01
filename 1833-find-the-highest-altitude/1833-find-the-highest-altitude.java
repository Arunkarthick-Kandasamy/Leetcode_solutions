class Solution {
    public int largestAltitude(int[] gain) {
        int max=gain[0];
        for(int i=1;i<gain.length;i++)
        {
            gain[i]=gain[i]+gain[i-1];
            if(max<gain[i])
            {
                max=gain[i];
            }
       
        }
        if(max<0)
            max=0;
       return max; 
    }
}