/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node random;

    Node(int x) {
        data = x;
        next = null;
        random = null;
    }
}*/

class Solution {
    public Node cloneLinkedList(Node head) {
       Node iter=head;
              Node front=null;
              Node copy;

              while(iter!=null){
                  front=iter.next;
                  copy=new Node(iter.data);
                  iter.next=copy;
                  copy.next=front;
                  iter=front;
              }

              iter=head;
              while(iter!=null){
                  if(iter.random!=null){
                      iter.next.random=iter.random.next;
                  }
                  iter=iter.next.next;
              }

              iter=head;
              front=null;
              Node dummy=new Node(0);
              copy=dummy;

              while(iter!=null){
                  front=iter.next.next;
                  copy.next=iter.next;
                  iter.next=front;
                  copy=copy.next;
                  iter=front;
              }

              return dummy.next;
    }
}