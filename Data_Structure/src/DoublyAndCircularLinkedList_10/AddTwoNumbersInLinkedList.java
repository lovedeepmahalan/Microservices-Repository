package DoublyAndCircularLinkedList_10;

public class AddTwoNumbersInLinkedList {

    public static SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {
    	SinglyNode dummyHead = new SinglyNode(0); // Placeholder for the result
    	SinglyNode curr = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate carry for the next digit
            curr.next = new SinglyNode(sum % 10); // Store the current digit
            curr = curr.next;
        }

        return dummyHead.next; // Skip the placeholder node
    }

    public static void printList(SinglyNode head) {
    	SinglyNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First number: 342 (represented as 2 -> 4 -> 3)
    	SinglyNode l1 = new SinglyNode(2);
        l1.next = new SinglyNode(4);
        l1.next.next = new SinglyNode(3);

        // Second number: 465 (represented as 5 -> 6 -> 4)
        SinglyNode l2 = new SinglyNode(5);
        l2.next = new SinglyNode(6);
        l2.next.next = new SinglyNode(4);

        System.out.println("First Number:");
        printList(l1);

        System.out.println("Second Number:");
        printList(l2);

        SinglyNode result = addTwoNumbers(l1, l2);

        System.out.println("Result (Sum):");
        printList(result);
    }
}