package Singly_LinkedList_9;



public class SortingOfList {

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addAtLast(12);
        sl.addAtLast(34);
        sl.addAtLast(11);
        sl.addAtLast(35);
        sl.addAtLast(17);
        sl.addAtLast(33);
        sl.addAtLast(10);
        sl.addAtLast(31);

        sl.setHead(listSorting(sl.getHead()));
        sl.displayList();
    }

    private static Node listSorting(Node head) {
        if (head == null || head.next == null) return head;

        // Finding the middle of the list
        Node slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Splitting the list into two halves
        prev.next = null;

        // Recursive sorting of two halves
        Node firstHalf = listSorting(head);
        Node secondHalf = listSorting(slow);

        // Merging the two sorted halves
        return mergeSort(firstHalf, secondHalf);
    }

    private static Node mergeSort(Node firstHalf, Node secondHalf) {
        Node dummy = new Node(-1); // Dummy node to avoid null checks
        Node temp = dummy;

        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data < secondHalf.data) {
                temp.next = firstHalf;
                firstHalf = firstHalf.next;
            } else {
                temp.next = secondHalf;
                secondHalf = secondHalf.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (firstHalf != null) temp.next = firstHalf;
        if (secondHalf != null) temp.next = secondHalf;

        return dummy.next; // Return the actual sorted list, skipping the dummy node
    }
}