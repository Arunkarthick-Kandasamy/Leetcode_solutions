class Solution:
    def addSpaces(self, s: str, spaces: List[int]) -> str:
        k=""
        j=0
        for i in spaces:
            k+=s[j:i]
            k+=" "
            j=i
        k+=s[j:]
        return k