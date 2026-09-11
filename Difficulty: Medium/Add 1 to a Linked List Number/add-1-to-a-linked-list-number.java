/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node reverse(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public Node addOne(Node head) {
        Solution obj=new Solution();
        Node newHead=obj.reverse(head);
        Node temp=newHead;
        int carry=1;
        while(temp!=null){
            if(temp.data<=8){
                temp.data+=carry;
                carry=0;

            }
            else if(temp.data==9){
                if(carry==1){
                    temp.data=0;

                    if(temp.next==null){
                        Node newNode=new Node(carry);
                        temp.next=newNode;
                        carry=0;

                    }

                }

            }
            temp=temp.next;

        }
        return obj.reverse(newHead);
    }
}