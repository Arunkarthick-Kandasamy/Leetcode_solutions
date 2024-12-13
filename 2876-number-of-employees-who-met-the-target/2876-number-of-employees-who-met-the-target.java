class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result=0;
        for(int i : hours)
        {
            if(target<=i)
                result++;
        }
        return result;
    }
}