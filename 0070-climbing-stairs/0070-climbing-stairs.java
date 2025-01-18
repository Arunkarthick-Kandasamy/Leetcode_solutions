class Solution {
    public int climbStairs(int n) {
        int i=1,j=1;
        while(n!=0)
        {
            j=i+j;
            i=j-i;
            n--;
        }
        return i;
        
    }
}