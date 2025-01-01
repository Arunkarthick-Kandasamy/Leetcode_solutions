class Solution {
    public int maxScore(String s) {
        int result=0;
        int count = 0;
        int left =0;
        int right = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                left++;
            }
        }
        for(int i = s.length()-1;i>0;i--)
        {
            if(s.charAt(i)=='1')
            {
                right++;
            }
            else
            {
                left--;
            }
            count=left+right;
            if(result<count)
            {
                result=count;
            }
        }
        return result;
        
    }
}