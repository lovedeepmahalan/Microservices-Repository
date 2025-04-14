package DoublyLinkedList;

public class DisplayDoublyLinkedList {

	public static void main(String[] args) {
		Doubly_LinkedList dl=new Doubly_LinkedList();
		
		dl.insertAtLast(56);
		dl.insertAtHead(0);
		dl.insertAtLast(57);
		dl.insertAtLast(58);
		dl.insertAtLast(59);
		dl.insertAtLast(51);
		dl.insertAtLast(52);
		dl.displayList();
		dl.getElement(0);
		dl.getElement(3);
	}
}
