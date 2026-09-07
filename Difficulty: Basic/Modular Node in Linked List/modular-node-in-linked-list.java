/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/

class Solution {
    public int modularNode(Node head, int k) {
        
        Node curr = head;
        int pos =1;
        int lastdiv =-1;
        while(curr !=null){
            
            if(pos%k==0){
                lastdiv = curr.data;
            }
            pos++;
            curr=curr.next;
            
        }
        return lastdiv;
    }
}