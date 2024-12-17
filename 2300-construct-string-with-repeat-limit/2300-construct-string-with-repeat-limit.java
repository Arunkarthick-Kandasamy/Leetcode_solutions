class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        int max = 25, max2;

        while (true) {
            while (max >= 0 && count[max] == 0) {
                max--;
            }

            if (max < 0) break;

            int r_count = Math.min(repeatLimit, count[max]);
            for (int i = 0; i < r_count; i++) {
                result.append((char) ('a' + max));
            }
            count[max] -= r_count;

            if (count[max] == 0) continue;

            max2 = max - 1;
            while (max2 >= 0 && count[max2] == 0) {
                max2--;
            }

            if (max2 < 0) break;

            result.append((char) ('a' + max2));
            count[max2]--;
        }

        return result.toString();
    }
}
