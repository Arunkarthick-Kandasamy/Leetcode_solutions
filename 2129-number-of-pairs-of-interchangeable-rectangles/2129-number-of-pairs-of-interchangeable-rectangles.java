import java.util.HashMap;

class Solution {
    public long interchangeableRectangles(int[][] r) {
        HashMap<String, Integer> map = new HashMap<>();
        long count = 0;

        for (int[] rect : r) {
            int width = rect[0];
            int height = rect[1];
            int gcd = gcd(width, height);
            String ratio = (width / gcd) + ":" + (height / gcd);

            count += map.getOrDefault(ratio, 0);
            map.put(ratio, map.getOrDefault(ratio, 0) + 1);
        }

        return count;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
