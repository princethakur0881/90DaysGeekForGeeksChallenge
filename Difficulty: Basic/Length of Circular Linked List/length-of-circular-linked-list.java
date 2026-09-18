/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        if(head==null) return 0;
        
    
       int count = 1;
       
        Node currNode = head;
        
        while(currNode.next !=head){
         count++;
            currNode  = currNode.next;
        }
        return count;
        
    }
}