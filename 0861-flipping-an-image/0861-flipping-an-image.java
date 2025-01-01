class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        
        for(int i=0;i<n;i++)
        {
            int left=0,right=n-1;
            while(left<=right)
            {
                if(image[i][left]==image[i][right])
                {
                    image[i][left]=image[i][right]=1-image[i][right];
                }
                left++;
                right--;
            }
        }
        return image;
    }
}