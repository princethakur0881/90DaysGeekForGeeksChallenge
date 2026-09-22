/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
       Node l1= head1;
               Node l2=head2;
               int la=0;
               while(l1!=null)
               {
                   la++;
                   l1=l1.next;
               }
               int lb=0;
               while(l2!=null)
               {
                   lb++;
                   l2=l2.next;
               }
               l1=head1;
               l2=head2;
               int def=Math.abs(lb-la);
               if(la>lb)
               {
                   for(int i=0;i<def;i++)
                   {
                       l1=l1.next;
                   }
               }
               else
               {
                   for(int i=0;i<def;i++)
                   {
                       l2=l2.next;
                   }
               }
               while(l1!=null && l2!=null)
               {
                   if(l1==l2)
                   {
                       return l1;
                   }
                   l1=l1.next;
                   l2=l2.next;
               }
               return null;
    }
}