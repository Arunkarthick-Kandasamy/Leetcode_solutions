class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)
            return false;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int eve=0,odd=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]%2==0)
            {
                eve++;
            }
            else
                odd++;
        }
        if(odd>k)
            return false;
        return true;

        
    }
}