class Solution {
    public int minBitFlips(int start, int goal) {
        start ^= goal ;
        if(start < 1)
        {
            return 0;

        }
        int sum = 1;
        while(start>1)
        {
            sum += start % 2;
            start /=2;
        }
        return sum;
        
    }
}