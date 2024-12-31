class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n1=mat.length,n2=mat[0].length;
        if((n1*n2 != r*c) || (n1==r && n2==c))
        {
            return mat;
        }
        int x=0,y=0;
        int[][] result = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                result[i][j]=mat[x][y];
                y++;
                if(n2<=y)
                {
                    y=0;
                    x++;
                }
            }
        }
        return result;
        
    }
}