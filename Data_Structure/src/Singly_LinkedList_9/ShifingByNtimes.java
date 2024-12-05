package Singly_LinkedList_9;

public class ShifingByNtimes {

    public static NodeForSingly rightMove(NodeForSingly head, int n) {
        if (head == null || head.next == null || n == 0) {
            return head;
        }

        // Find the length of the linked list
        int p = 0;
        NodeForSingly curr = head;
        while (curr != null) {
            p++;
            curr = curr.next;
        }

        // Calculate effective rotations needed
        n = n % p;
        if (n == 0) {
            return head;
        }

        // Find the last node
        NodeForSingly last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Create a circular linked list
        last.next = head;

        // Find the new head (p - n - 1 steps from the current head)
        curr = head;
        for (int i = 0; i < p - n - 1; i++) {
            curr = curr.next;
        }

        // Break the circular linked list and set the new head
        head = curr.next;
        curr.next = null;

        return head;
    }

    public static void printList(NodeForSingly head) {
        NodeForSingly curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeForSingly a = new NodeForSingly(2);
        NodeForSingly b = new NodeForSingly(6);
        NodeForSingly c = new NodeForSingly(1);
        NodeForSingly d = new NodeForSingly(7);
        NodeForSingly e = new NodeForSingly(9);
        NodeForSingly f = new NodeForSingly(5);
        NodeForSingly g = new NodeForSingly(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        System.out.println("Lis before rotate:");
        printList(a);

        NodeForSingly newHead = rightMove(a, 3);

        System.out.println("List after moving right by 3 positions:");
        printList(newHead);
    }
}
