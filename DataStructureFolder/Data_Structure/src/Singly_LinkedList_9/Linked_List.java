package Singly_LinkedList_9;

public class Linked_List {

	public static void main(String[] args) {
	
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addFirst(12);
		sl.addFirst(1);
		sl.addFirst(20);
		sl.addFirst(24);
		sl.addFirst(25);
		sl.addFirst(26);
		sl.addFirst(27);
		sl.addFirst(28);
		sl.addFirst(29);
		sl.displayList();
		System.out.println(sl.size);
		sl.deleteFromLast(5);
		sl.displayList();
		System.out.println(sl.size);
	}
}
