/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Node currNode = head;
        if(head==null) return ans;
        while(currNode!=null){
            ans.add(currNode.data);
            currNode = currNode.next;
        }
        return ans;
    }
}