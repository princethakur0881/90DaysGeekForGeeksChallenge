/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
  private static Node Reverse(Node start) {
          Node prev=null;
          Node curr=start;
          while(curr!=null) {
              Node forw=curr.next;
              curr.next=prev;
              prev=curr;
              curr=forw;
          }
          return prev;
      }
      public static Node reverseBetween(int a, int b, Node head) {
          // code here
          if(head==null || head.next==null || a==b) return head;
          Node dummy = new Node(-1);
          dummy.next=head;
          Node prev=dummy;
          for(int i=1; i<a; i++) {
              prev=prev.next;
          }
          Node start=prev.next;
          Node end=start;
          for(int i=a; i<b; i++) {
              end=end.next;
          }
          Node next=end.next;
          end.next=null;
          Node reverse=Reverse(start);
          prev.next=reverse;
          start.next=next;
          return dummy.next;
      }
}