/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        Node curr = head;
        while(curr !=null && curr.next != null){
            curr = curr.next.next;
            if(curr ==null){
                return true;
            }
            
        }
        return false;
    }
}