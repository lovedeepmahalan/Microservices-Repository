package DoublyLinkedList;

public class Display_CircularLinkedList {

	public static void main(String[] args) {
		Circular_LinkedList cls=new Circular_LinkedList();
		cls.addFirst(12);
		cls.addAtTail(23);
		cls.addAtTail(45);
		cls.addAtTail(74);
		cls.addAtTail(19);
		cls.addAtTail(42);
		cls.addAtTail(98);
		cls.deletehead();
		cls.displayList();
		cls.deletehead();
		cls.displayList();
		cls.deleteTail();
		cls.displayList();
		cls.deleteTail();
		cls.displayList();
	}
}
