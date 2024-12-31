class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            temp.add(index[i],nums[i]);
        }
        return temp.stream().mapToInt(Integer::intValue).toArray();
        
    }
}