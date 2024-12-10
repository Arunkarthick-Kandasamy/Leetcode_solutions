class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word : words)
        {
            int temp=0;
            for(int i=0;i<word.length();i++)
            {
                char ch=word.charAt(i);
                if(! allowed.contains(String.valueOf(ch)))
                {
                    break;
                }
                temp++;
            }
            if(word.length()==temp)
            {
                count++;
            }
        }
        return count;
    }
}