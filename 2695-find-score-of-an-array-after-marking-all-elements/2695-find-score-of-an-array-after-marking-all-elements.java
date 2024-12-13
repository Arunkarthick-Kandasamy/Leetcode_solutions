class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i] = new int[] { nums[i], i };
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        boolean[] ind = new boolean[n];
        long score = 0;

        for (int[] i : arr) {
            int val = i[0];
            int j = i[1];

            if (!ind[j])
            {
                ind[j] = true;
                score += val;
                if (j > 0) 
                    ind[j - 1] = true;
                if (j < n - 1) 
                    ind[j + 1] = true;

                
            }
        }

        return score;
    }
}
