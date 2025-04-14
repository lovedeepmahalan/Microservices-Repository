package DoublyLinkedList;

class Node{
	int val;
	Node next;
	Node prev;
	Node(int val){
		this.val=val;
	}
}
public class Doubly_LinkedList {
	Node head;
	Node tail;
	int size;
	public void insertAtHead(int data) {
		Node a=new Node(data);
		if(head==null) {
			head=a;
			tail=a;
			tail.next=null;
		}else {
			head.prev=a;
			a.next=head;
			head=a;
		}
		head.prev=null;
		size++;
	}
	public void insertAtGivenIndex(int index,int data) {
		Node a=new Node(data);
		if(index>=size) System.out.println("Sorry The index that you have entered is greater then the size of List");
		Node temp=head;
		for(int p=1;p<index;p++) temp=temp.next;
		a.next=temp.next;
		temp.next=a;
		a.prev=temp;
		a.next.prev=a;
		size++;
	}
	public void insertAtLast(int data) {
		Node a=new Node(data);
		if(head==null) {
			head=a;
			tail=a;
			head.prev=a;
			a.next=head;
		}else {
			tail.next=a;
			a.prev=tail;
			tail=tail.next;
		}
		tail.next=null;
		size++;
	}
	public void printReverse() {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	public void displayList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}
	public void deleteHead() {
		if(head==null)System.out.println("You can't delete the head because the list is empty");
		if(head.next==null) {
			head=null;
			tail=null;
			size--;
			return ;
		}
		head=head.next;
		head.prev=null;
		size--;
	}
	public void deleteTail() {
		if(head==null) System.out.println("Your List is null you can't delete the tail");
		if(head.next==null) {
			head=null;
			tail=null;
			size--;
			return;
		}
		tail=tail.prev;
		tail.next=null;		
	}
	public void deleteAtGivenIndex(int index) {
		if (index < 0 || index >= size) {
	        System.out.println("Sorry, the index you entered is out of bounds.");
	        return;
	    }
		   if (index == 0) {
		        head = head.next;
		        if (head != null) {
		            head.prev = null; // Set the new head's prev to null
		        }
		        size--;
		        return;
		    }
		   if (index == size - 1) {
		        deleteTail(); // You can use your deleteTail method to handle tail deletion
		        return;
		    }
		Node temp=head;
		for(int p=1;p<index;p++) temp=temp.next;
		 temp.prev.next = temp.next; 
		    if (temp.next != null) {
		        temp.next.prev = temp.prev; 
		    }
		    temp.next = null;  
		    temp.prev = null; 

		    size--;
	}
	public void getElement(int index) {
		if(index==0) {
			System.out.println(head.val);;
			return;
		}
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		System.out.println(temp.val);
	}
}
