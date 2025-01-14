# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], l: int, r: int) -> Optional[ListNode]:
        arr=[]
        while(head!=None):
            arr.append(head.val)
            head=head.next
        l-=1
        r-=1
        while(l<r):
            temp=arr[l]
            arr[l]=arr[r]
            arr[r]=temp
            r-=1
            l+=1
        head=ListNode(arr[0])
        temp=head
        
        for i in range(1,len(arr)):
            nn=ListNode(arr[i])
            temp.next=nn
            temp=nn

        return head
        