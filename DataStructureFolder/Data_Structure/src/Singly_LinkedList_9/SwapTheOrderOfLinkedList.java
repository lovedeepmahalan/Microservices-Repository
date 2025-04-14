package Singly_LinkedList_9;

// Swap the pair of two consecutive Nodes of the list
public class SwapTheOrderOfLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addFirst(1);
        sl.addAtLast(3);
        sl.addAtLast(2);
        sl.addAtLast(6);
        sl.addAtLast(4);
        
        // Swap every two consecutive nodes
        swapOrder(sl.head);
        sl.displayList();
    }

    // Swap every pair of consecutive nodes in the list
    private static Node swapOrder(Node head) {
        if (head == null || head.next == null) {
            return head; // If there are fewer than two nodes, no swap is possible.
        }
        
        // Create a dummy node that points to the head
        Node dummy = new Node(-1);
        dummy.next = head;
        
        Node current = dummy;
        
        // Traverse the list and swap pairs of nodes
        while (current.next != null && current.next.next != null) {
            Node first = current.next;          // First node in the pair
            Node second = current.next.next;    // Second node in the pair
            
            // Swap the nodes
            first.next = second.next;
            second.next = first;
            current.next = second;  // Update the previous node to point to the second node
            
            // Move current two steps forward
            current = first;
        }
        
        return dummy.next; // Return the new head, which is after the dummy node
    }
}
