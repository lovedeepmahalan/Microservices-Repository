package Singly_LinkedList_9;

public class MergeKSortedLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sl1=new SinglyLinkedList();
		SinglyLinkedList sl2=new SinglyLinkedList();
		SinglyLinkedList sl3=new SinglyLinkedList();
		SinglyLinkedList sl4=new SinglyLinkedList();
		Node[] arr= {sl1.head,sl2.head,sl3.head,sl4.head};
		SinglyLinkedList result=new SinglyLinkedList();
	//	result.head= MergeKList(arr);
		
	}

//	private static Node MergeKList(Node[] arr) {
//		
//	}
//	
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

