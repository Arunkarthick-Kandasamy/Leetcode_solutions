class Solution {
    public String reverseVowels(String s) {
        char[] vow = new char[s.length()];
        char[] cons =s.toCharArray();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            {
                vow[j]=ch;
                j++;
            }
        }
        j--;
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            {
                cons[i]=vow[j];
                j--;
            }
        }
        return new String(cons);
    }
}