package Singly_LinkedList_9;

public class ToFindLoopInList {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addFirst(1);
		sl.addAtLast(12);
		sl.addAtLast(56);
		sl.addAtLast(21);
		sl.addAtLast(19);
		sl.addAtLast(24);
		sl.addAtLast(98);
		sl.tail.next=sl.getHead().next;
		
		System.out.println(tofindLoopInLinkedList(sl));;
		System.out.println(toFindNodeFromLoopStart(sl));
		if(toFindNodeFromLoopStart(sl)==-1) {
			System.out.println("List does not make any loop");
		}else {
			System.out.println("Loop start form the node ::"+toFindNodeFromLoopStart(sl));
		}
	}

	private static int toFindNodeFromLoopStart(SinglyLinkedList sl) {
		Node fast=sl.getHead();
		Node slow=sl.getHead();
		Node temp=sl.getHead();
		if(temp==null || temp.next==null)return -1;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		if(slow!=fast)return -1;
		while(slow!=temp) {
			slow=slow.next;
			temp=temp.next;
		}
		return slow.data;
	}

	private static boolean tofindLoopInLinkedList(SinglyLinkedList sl) {
		Node fast=sl.getHead();
		Node slow=sl.getHead();
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
}
