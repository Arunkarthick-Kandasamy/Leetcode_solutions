class Solution:
    def numWays(self, words: List[str], target: str) -> int:
        MOD = 10 ** 9 + 7
        n = len(words[0])  # Number of columns (assuming all words are the same length)
        m = len(target)    # Length of the target string
        # Creating a list of dictionaries to count occurrences of each character in each column
        counter = [defaultdict(int) for _ in range(n)]
        for word in words:
            for i in range(n):
                counter[i][word[i]] += 1

        @cache
        def dp(i, j):
            # If all characters of the target are used, return 1 (successful formation)
            if j == m:
                return 1
            # If we've used up all columns or can't possibly form the target with remaining columns
            if i >= n or n - i < m - j:
                return 0

            # Not using the current column
            not_take = dp(i + 1, j)
            # Using the current column if it contains the current target character
            take = counter[i][target[j]] * dp(i + 1, j + 1) if target[j] in counter[i] else 0

            return (not_take + take) % MOD

        return dp(0, 0) % MOD  # Return the result modulo 10**9 + 7