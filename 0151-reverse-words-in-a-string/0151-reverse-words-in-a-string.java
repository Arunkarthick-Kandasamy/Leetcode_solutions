class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        String str="";
        int k=arr.length-1;
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)==' ')
        //     {
        //         arr[k]=str;
        //         str="";
        //         k++;
        //         continue;
        //     }
        //     str+=s.charAt(i);
        // }
        // arr[k]=str;
        int st=0;
        while(st<k)
        {
            String temp=arr[st];
            arr[st]=arr[k];
            arr[k]=temp;
            k--;
            st++;
        }
        return String.join(" ", arr);
    }
}