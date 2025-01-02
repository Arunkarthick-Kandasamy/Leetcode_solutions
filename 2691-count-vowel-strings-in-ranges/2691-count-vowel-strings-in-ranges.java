class Solution {
    public int[] vowelStrings(String[] w, int[][] q) {
        int[] vow = new int[w.length];
        if("aeiou".indexOf(w[0].charAt(0)) != -1 && "aeiou".indexOf(w[0].charAt(w[0].length()-1)) != -1 )
        {
            vow[0]=1;
        }
        for(int j =1;j<w.length;j++)
        {
            int n = w[j].length()-1;
                if("aeiou".indexOf(w[j].charAt(0)) != -1 && "aeiou".indexOf(w[j].charAt(n)) != -1 )
                {
                    vow[j]=vow[j-1]+1;
                }
                else
                {
                    vow[j]=vow[j-1];
                }
        }
        int[] result = new int[q.length];
        for(int i=0;i<q.length;i++)
        {
            if(q[i][0]==0)
            {
                result[i]=vow[q[i][1]];
            }
            else
                result[i]=vow[q[i][1]] - vow[q[i][0]-1];
            if(result[i]<0)
            {
                result[i]=0;
            }
        }
        return result;
        
    }
}