class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length-1;
        for(int i=0;i<=n;i++)
        {
            if(i!=n-i)
                sum+=mat[i][i]+mat[i][n-i];
            else
                sum+=mat[i][i];
        }
        return sum;
    }
}