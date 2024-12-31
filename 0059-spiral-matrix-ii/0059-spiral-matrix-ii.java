class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left=0,up=0,right=n-1,down=n-1;
        int k=1;
        while(left<=right && up <= down)
        {
            for(int i=left;i<=right;i++)
            {
                result[up][i]=k;
                k++;
            }
            up++;
            for(int i=up;i<=down;i++)
            {
                result[i][right]=k;
                k++;
            }
            right--;
            if(up<=down)
            {
                for(int i=right;i>=left;i--)
                {
                    result[down][i]=k;
                    k++;
                }
            }
            down--;
            if(left<=right)
            {
                for(int i=down;i>=up;i--)
                {
                    result[i][left]=k;
                    k++;
                }
            }
            left++;
        }
        return result;
        
    }
}