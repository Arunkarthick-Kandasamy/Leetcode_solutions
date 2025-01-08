class Solution:
    def reverseWords(self, s: str) -> str:
        lis=s.split()
        return " ".join(lis[::-1])
        