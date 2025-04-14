package DoublyLinkedList;

class Nodee{
	int data;
	Nodee next;
	
	Nodee(int data){
		this.data=data;
	}
}
public class Circular_LinkedList {
	Nodee head;
	Nodee tail;
	int size;
	
	public void addFirst(int data) {
		Nodee newNode=new Nodee(data);
		if(head==null&&tail==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			size++;
			return;
		}
		newNode.next=head;
		tail.next=newNode;
		head=newNode;
		size++; 	
	}	
	public void addAtTail(int data) {
		Nodee newNode=new Nodee(data);
		if(head==null&&tail==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			size++;
			return;
		}
		tail.next=newNode;
		newNode.next=head;
		tail=newNode;
		size++;
	}
	
	public void deletehead() {
		if(head==null) {
			System.out.println("Your List is empty you can't delete the data");
			return ;
		}
		if(head.next==null) {
			head=null;
			size--;
			return;
		}
		head=head.next;
		tail.next=head;
		size--;
	}
	public void deleteTail() {
		if(head==null) {
			System.out.println("Your List is empty you can't delete the data");
			return ;
		}
		if(head.next==null) {
			head=null;
			size--;
			return;
		}
		Nodee temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=head;
		tail=null;
		tail=temp;
		size--;
	}
	public void displayList() {
		Nodee temp=head;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		if(head==tail) {
			System.out.println(head.data);
			return;
		}
		
		while(temp!=tail) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(tail.data);
	}
}
