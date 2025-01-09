class Solution {
    public int prefixCount(String[] w, String p) {
        int count = 0;
        for(int i=0;i<w.length;i++)
        {
            if(w[i].startsWith(p))
                count++;
        }
        return count;        
    }
}