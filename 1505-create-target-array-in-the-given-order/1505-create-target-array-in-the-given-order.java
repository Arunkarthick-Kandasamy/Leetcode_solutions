class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            temp.add(index[i],nums[i]);
        }
        int[] result = new int[temp.size()];
        for(int i = 0;i<result.length;i++)
        {
            result[i]=temp.get(i);
        }        
        return result;
    }
}