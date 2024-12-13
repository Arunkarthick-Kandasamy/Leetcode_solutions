class Solution {
    public int smallestNumber(int n) {
        int result=0,i=1;
        while(n>0)
        {
            System.out.println(result);
            result=result+i;
            i=i*2;
            n=n/2;
        }
        return result;
    }
}