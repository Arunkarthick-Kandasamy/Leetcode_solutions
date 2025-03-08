class Solution 
{
    public int minimumRecolors(String blocks, int k) 
    {
        int b = 0;
        for(int i = 0 ; i < k ;i++)
        {
            if(blocks.charAt(i) == 'B')
                b++;
        }   
        int min = k - b;
        int st = 0;
        for(int i = k ; i < blocks.length() ; i++)
        {
            System.out.println(min);
            if(blocks.charAt(st++) == 'B')
                b--;
            if(blocks.charAt(i) == 'B')
                b++;
            min = (k - b) < min ? (k - b) : min;  
            if(min == 0)
                    return 0;
        }
        return min ;
    }
}