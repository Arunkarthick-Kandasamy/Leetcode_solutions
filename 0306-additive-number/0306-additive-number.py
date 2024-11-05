class Solution:
    def isAdditiveNumber(self, num: str) -> bool:
        def valid(n1, n2):
            new = n1 + n2
            while len(new) < len(num):
                n3 = str(int(n1) + int(n2))
                new += n3
                n1, n2 = n2, n3
            return new == num
        def dfs():
            for i in range(len(num) - 2):
                n1 = num[:i + 1]
                if len(n1) > 1 and n1[0] == "0": break
                for j in range(i + 1, len(num) - 1):
                    n2 = num[i + 1: j + 1]
                    if len(n2) > 1 and n2[0] == "0": break
                    if valid(n1, n2):
                        return True
            return False
        return dfs()
        