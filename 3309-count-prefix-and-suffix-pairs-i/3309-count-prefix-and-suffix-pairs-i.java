class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0,n=words.length;
        for(int i=0;i<n;i++)
        {
            int len=words[i].length();
            for(int j=i+1;j<n;j++)
            {
                int j_len=words[j].length();
                boolean flag=true;
                if(len>j_len)
                {
                    continue;
                }
                for(int k=0;k<len;k++)
                {
                    if(words[i].charAt(k)!=words[j].charAt(k)  || words[i].charAt(k)!=words[j].charAt(j_len-len+k))
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
        }
        return count;
    }
}