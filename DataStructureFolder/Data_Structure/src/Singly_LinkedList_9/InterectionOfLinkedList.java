package Singly_LinkedList_9;

public class InterectionOfLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList sl=new SinglyLinkedList();
		sl.addFirst(1);
		sl.addFirst(2);
		sl.addAtLast(12);
		sl.addAtLast(56);
		sl.addAtLast(21);
		sl.addAtLast(19);
		sl.addAtLast(24);
		sl.addAtLast(98);
		
		
		SinglyLinkedList sl2=new SinglyLinkedList();
		sl2.addFirst(87);
		sl2.addAtLast(54);
		sl2.addAtLast(44);
		sl2.addAtLast(21);
		sl2.addAtLast(19);
		sl2.addAtLast(24);
		sl2.addAtLast(98);
		
		findIntersectionOfLinkedList(sl,sl2);
	}

	private static void findIntersectionOfLinkedList(SinglyLinkedList sl, SinglyLinkedList sl2) {
		
		Node temp1=sl.getHead();
		int len1=0;
		int len2=0;
		Node temp2=sl2.getHead();
		
		while(temp1!=null) {
			temp1=temp1.next;
			len1++;
		}
		while(temp2!=null) {
			temp2=temp2.next;
			len2++;
		}
		
		temp1=sl.getHead();
		temp2=sl2.getHead();
		if(len1<len2) {
			for(int i=1;i<=(len2-len1);i++) {
				temp2=temp2.next;
			}
		}else {
			for(int i=1;i<=(len1-len2);i++) {
				temp1=temp1.next;
			}		}
		
		 while (temp1 != null && temp2 != null) {
	            if (temp1.data == temp2.data) { // Ensure it's the same node reference
	                System.out.println(temp1.data);// Intersection found
	                break;
	            }
	            temp1 = temp1.next;
	            temp2 = temp2.next;
	        }

	        
	}
}
