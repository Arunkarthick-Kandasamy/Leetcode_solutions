class Solution {
    public int prefixCount(String[] w, String p) {
        int n = p.length() , count = 0;
        for(int i=0;i<w.length;i++)
        {
            if(w[i].length()<n)
            {
                continue;
            }
            boolean flag=true;
            for(int j=0;j<n;j++)
            {
                if(p.charAt(j)!=w[i].charAt(j))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;        
    }
}