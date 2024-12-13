class Solution {
    public int smallestNumber(int n) {
        int ind=1,result=0;
        while(n>0)
        {
            n=n/2;
            result=result+ind;
            ind=ind*2;
        }
        return result;
        
    }
}