class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        char ch;
        for(int i=0;i<k;i++)
        {
            ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count++;
            }
        }
        int max_count=count;
        for(int i=k;i<s.length();i++)
        {
            ch=s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {

                    count++;

            }
            ch=s.charAt(i-k);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count--;
            }
            if(max_count<count)
                max_count=count;
        }
        return max_count;
        
    }
}