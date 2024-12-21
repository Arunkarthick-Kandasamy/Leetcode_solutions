class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result=0,t=0;
        for(int i=0;i<s.length();i++)
        {
            int count=1;
            for(int j=i-1;j>=0 && t>0;j--)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    break;
                }
                count++;
                t--;
            }
            t=count;
            if(result<count)
            {
                result=count;
            }
        }
        return result;
        
    }
}