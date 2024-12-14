import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int st = 0;
        long count = 0;

        Deque<Integer> i = new LinkedList<>();
        Deque<Integer> d = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            while (!i.isEmpty() && nums[j] < nums[i.peekLast()]) {
                i.pollLast();
            }
            while (!d.isEmpty() && nums[j] > nums[d.peekLast()]) {
                d.pollLast();
            }

            i.addLast(j);
            d.addLast(j);

            while (nums[d.peekFirst()] - nums[i.peekFirst()] > 2) {
                if (i.peekFirst() == st) {
                    i.pollFirst();
                }
                if (d.peekFirst() == st) {
                    d.pollFirst();
                }
                st++;
            }

            count += (j - st + 1);
        }

        return count;
    }
}
