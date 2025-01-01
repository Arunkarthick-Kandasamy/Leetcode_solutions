class Solution {
    public int oddCells(int m, int n, int[][] ind) {
        int[][] result=new int[m][n];
        for(int i =0;i<ind.length;i++)
        {
            for(int j =0 ;j<n;j++)
            {
                result[ind[i][0]][j]++;
            }
            for(int j =0;j<m;j++)
            {
                result[j][ind[i][1]]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(result[i][j]%2!=0)
                    count++;
            }
        }
        return count;        
    }
}