class Solution {
    public int[] minOperations(String boxes) {
        char[] ch=boxes.toCharArray();
        int n=boxes.length();
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=0;j<n;j++)
            {
                if(ch[j]=='1' && i!=j)
                {
                    temp+=Math.abs(i-j);
                }
            }
            result[i]=temp;
        }
        return result;
    }
}