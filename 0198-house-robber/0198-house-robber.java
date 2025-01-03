class Solution {
    public int rob(int[] nums) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < nums.length; i ++) {
            int temp = y + nums[i];
            int temp1 = Math.max(y, x);
            x = temp;
            y = temp1;
        }
        return Math.max(x, y);
    }
}