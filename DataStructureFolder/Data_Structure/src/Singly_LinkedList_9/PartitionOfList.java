package Singly_LinkedList_9;
public class PartitionOfList {

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addFirst(1);
        sl.addAtLast(3);
        sl.addAtLast(2);
        sl.addAtLast(6);
        sl.addAtLast(4);
        sl.addAtLast(5);
        makePartition(sl.head, 5);
        sl.displayList();
    }

    private static Node makePartition(Node head, int x) {
        Node a = new Node(-1); 
        Node b = new Node(-1); 
        Node tempa = a;
        Node tempb = b;
        Node temp = head;

        while (temp != null) {
            if (temp.data <= x) {
                tempa.next = temp;  
                tempa = tempa.next;  
            } else {
                tempb.next = temp; 
                tempb = tempb.next;  
            }
            temp = temp.next;
        }
       
        tempb.next = null;  // End the greater-than list to avoid cycles
        tempa.next = b.next;  // Connect the two lists

        return a.next; 
    }
}
