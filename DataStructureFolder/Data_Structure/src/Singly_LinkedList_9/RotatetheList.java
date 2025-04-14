package Singly_LinkedList_9;

public class RotatetheList {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addFirst(12);
		sl.addAtLast(13);
		sl.addAtLast(54);
		sl.addAtLast(17);
		sl.addAtLast(34);
		sl.addAtLast(24);
		sl.addAtLast(10);
		sl.addAtLast(98);
		System.out.println(rotateList(sl.getHead(),3).data);
		sl.displayList();
	}

	 private static Node rotateList(Node head, int k) {
	        if (head == null || head.next == null || k == 0) return head;

	        // Find length of the linked list
	        int length = 1;
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	            length++;
	        }

	        // Handle cases where k is greater than length
	        k = k % length;
	        if (k == 0) return head; // No rotation needed

	    	Node slow=head;
			Node fast=head;
			for(int x=0;x<k;x++) {
				fast=fast.next;
			}
			while(fast.next!=null) {
				slow=slow.next;
				fast=fast.next;
			}
			Node newNode=slow.next;
			slow.next=null;
			fast.next=head;
			head=newNode;
			return newNode;
	    }
}
