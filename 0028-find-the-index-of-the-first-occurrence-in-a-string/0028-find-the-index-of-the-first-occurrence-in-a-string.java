class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length())
        {
            return -1;
        }
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0) && haystack.length()-i>=needle.length())
            {
                int j;
                for(j=1;j<needle.length();j++)
                {
                    if(needle.charAt(j)!=haystack.charAt(i+j))
                    {
                        break;
                    }
                }
                if(j==needle.length())
                {
                    return i;
                }
            }
        }
        return -1;
        
    }
}