class Solution {
    public int countMatches(List<List<String>> items, String key, String val) {
        int j;
        int count=0;
        if(key.equals("type"))
        {
            j=0;
        }
        else if(key.equals("color"))
        {
            j=1;
        }
        else
        {
            j=2;
        }
        for(List<String> i : items)
        {
            if(i.get(j).equals(val))
            {
                count++;
            }
        }
        return count;
        
    }
}