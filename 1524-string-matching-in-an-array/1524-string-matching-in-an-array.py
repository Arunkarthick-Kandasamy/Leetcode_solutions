class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        result=[]
        for i in range(len(words)):
            if words[i] in result:
                continue
            for j in range(len(words)):
                if words[i] in words[j] and i!=j and words[i] not in result:
                    result.append(words[i])
        return result

        