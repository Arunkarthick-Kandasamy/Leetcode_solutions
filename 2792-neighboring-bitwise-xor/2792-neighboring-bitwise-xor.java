class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int check=derived[0];
        for(int i=1;i<derived.length;i++)
        {
            check ^=derived[i];
        }
        return check==0;
        
    }
}