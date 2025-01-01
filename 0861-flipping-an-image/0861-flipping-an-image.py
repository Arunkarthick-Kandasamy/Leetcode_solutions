class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        n=len(image)
        for i in image:
            j=0
            k=n-1
            while(j<k):
                temp=i[j]
                i[j]=i[k]
                i[k]=temp
                k-=1
                j+=1
            for j in range(n):
                if i[j]:
                    i[j]=0
                else:
                    i[j]=1
        return image
        