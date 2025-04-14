package Singly_LinkedList_9;

class Node{
	int data;
	Node next;
	
	
	public Node(int data) {
		this.data=data;
	}
}
public class SinglyLinkedList {
	Node head;
	Node tail;
	int size;
	
	//insert at last of LinkedList
	public void addAtLast(int a) {
		Node node=new Node(a);
		if(getHead()==null) {
			setHead(node);
			tail=node;
			tail.next=null;
		}else {
			tail.next=node;
			tail=node;
			tail.next=null;
		}
		size++;
	}
	
	//Insert at first of LinkedList
	public void addFirst(int a) {
		Node node=new Node(a);
		if (getHead()==null) {
			setHead(node);
			tail=node;
		}else {
			node.next=getHead();
			setHead(node);
		}
		size++;
	}
	
	//Insert at given index of List
	public void addAtIndex(int index,int data) {
		if(size<index) {
			System.out.println("Sorry you cannot add because size of List is ::"+size+" Which is less then you index ::"+index);
		}else {
			Node curr=getHead();
			Node add=new Node(data);
			for(int i=0;i<index-1;i++) {
				curr=curr.next;
			}
			add.next=curr.next;
			curr.next=add;
			size++;
		}
	}
	
	public void deleteHead() {
		if(getHead()==null) {
			System.out.println("NullPointerException ::Your list is empty ");
			return;
		}
		
		if(getHead().next==null) {
			setHead(null);
			size--;
		} else {
			setHead(getHead().next);
			size--;
		}
	}
	
	public void deleteTail() {
		if(getHead()==null) {
			System.out.println("NullPointerException ::Your list is empty");
		}else if(getHead().next==null) {
			setHead(null);
			size--;
		}else {
			Node curr=getHead();
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
			tail=curr;
			size--;
		}
	}
	
	public void deleteFromIndex(int index) {
		if(size<=index) {
			throw new IndexOutOfBoundsException("size of LinkedList is less then the index");
		}
		else {
			Node curr=getHead();
			for(int i=0;i<index-1;i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
			size--;
		}
	}
	
	//get the element at required index.
	public void getelement(int index) {
		if(size<=index) {
			throw new IndexOutOfBoundsException("size of LinkedList is less then the index");
		}else {
			Node curr=getHead();
			for(int i=0;i<index-1;i++) {
				curr=curr.next;
			}
			System.out.println(curr.data);
		}
	}
	//delete element from last 
	public void deleteFromLast(int index) {
		if(size<index || index<0) {
			throw new IndexOutOfBoundsException("size of LinkedList is less then the index");
		}
		Node fast=getHead();
		Node slow=getHead();
		for(int i=0;i<index;i++) {
			fast=fast.next;
			
		}
		if(fast==null) {
			setHead(getHead().next);
			size--;
		}else {
			while(fast.next!=null) {
				fast=fast.next;
				slow=slow.next;
			}
			slow.next=slow.next.next;
			size--;
		}
	}
	//Print The List
	public void displayList() {
		if(getHead()==null) {
			System.out.println("Empty List");
		}
		
		Node curr=getHead();
		while(curr!=null) {
			System.out.print(curr.data +" ");
			curr=curr.next;
			
		}
		System.out.println();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
//when we have ArrayList then why we go for linked list
//because in linkedlist we can add or remove an element from inside the list.