class Solution:
    def maximumLength(self, s: str) -> int:
        dic={}
        for i in range(0,len(s)):
            ch=s[i]
            if ch not in dic:
                dic[ch]=1
            else:
                dic[ch]+=1
            for j in range(i+1,len(s)):
                if s[i]!=s[j]:
                    break
                ch+=s[j]
                if ch not in dic:
                    dic[ch]=1
                else:
                    dic[ch]+=1
        lis=[]
        for i in dic.keys():
            if dic[i]>=3:
                lis.append(len(i))
        if len(lis)==0:
            return -1
        return max(lis)

                

            