class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int[] hash=new int[26];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            hash[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(hash[i]>0)
            {
                n=n-hash[i];
                if(hash[i]%2==0)
                    n+=2;
                else
                    n++;
            }
        }
        return n;
        
    }
}