class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        for i in range(k):
            temp=max(gifts)**0.5
            gifts.remove(max(gifts))
            gifts.append(int(temp))
        return sum(gifts)
        