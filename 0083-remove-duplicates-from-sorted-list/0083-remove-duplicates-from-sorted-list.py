# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp=head
        lis=[]
        while(temp!=None):
            lis.append(temp.val)
            temp=temp.next
        lis=list(set(lis))
        head=ListNode(0)
        temp=head
        lis.sort()
        for i in lis:
            nn=ListNode(i)
            temp.next=nn
            temp=nn
        return  head.next

        