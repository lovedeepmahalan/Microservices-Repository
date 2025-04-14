package Singly_LinkedList_9;

public class FindMiddleElement {

	public static void main(String[] args) {
		
	SinglyLinkedList sl=new SinglyLinkedList();
	sl.addFirst(12);
	sl.addFirst(13);
	sl.addFirst(14);
	sl.addFirst(15);
	sl.addFirst(16);
	findMiddleBySinglePass(sl);
	findMiddleByTwoPass(sl);
	}

	private static void findMiddleByTwoPass(SinglyLinkedList sl) {
		Node slow=sl.getHead();
		Node fast=sl.getHead();
		while(fast!=null&&fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.data);
		
	}

	private static void findMiddleBySinglePass(SinglyLinkedList sl) {
		int length=sl.size;
		System.out.println("Total length of List is "+length);
		
		if (length == 0) {
            System.out.println("List is empty");
            return;
        }

		int mid=(length/2);
		Node temp=sl.getHead();
		for(int i=0;i<mid;i++) {
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

}
