class Solution:
    def flipAndInvertImage(self, image: List[List[int]]) -> List[List[int]]:
        n=len(image)
        k=0
        for i in image:
            i=i[::-1]
            for j in range(n):
                i[j]=1-i[j]
            image[k]=i
            k+=1
        return image
        