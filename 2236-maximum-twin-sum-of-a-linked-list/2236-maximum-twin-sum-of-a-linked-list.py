class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        result=[]
        temp=head
        while(temp!=None):
            result.append(temp.val)
            temp=temp.next
        max=-1
        for i in range(0,len(result)):
            if result[i]+result[len(result)-i-1]>max:
                max=result[i]+result[len(result)-1-i]
        return max
        