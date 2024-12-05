package Singly_LinkedList_9;

public class Linked_List {

	public static void main(String[] args) {
		NodeForSingly a= new NodeForSingly(3);
		NodeForSingly b= new NodeForSingly(5);
		NodeForSingly c= new NodeForSingly(4);
		NodeForSingly d= new NodeForSingly(8);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=null;
		
		NodeForSingly head=a;
		NodeForSingly curr=head;
		
		//printing the data of the LinkedList
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
		System.out.println();
		
		
		//insert at first
		NodeForSingly firstNode=new NodeForSingly(6);
		firstNode.next=head;
		head=firstNode;
		
		curr=head;//after first loop value of curr=null to do it again we have toasign again th value of curr
		System.out.println("Value added add the first of LinkedList ");
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
		//insert at end
		curr=head;
		NodeForSingly lastNode=new NodeForSingly(7);
		System.out.println("Value added add the Last of LinkedList ");
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=lastNode;
		curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
		//insert at kth value
		int k=3;
		curr=head;
		NodeForSingly kthNode=new NodeForSingly(12);
		for(int i=0;i<3;i++) {
			curr=curr.next;
		}
		kthNode.next=curr.next;
		curr.next=kthNode;
		
		curr=head;
		System.out.println();
		System.out.println("Value added at the kth number of LinkedList ");
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	
		
		//deleting the first element.
		head=head.next;
		curr=head;
		System.out.println();
		System.out.println("first Value deleted of LinkedList ");
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
		//deleting the last element
		curr=head;
		System.out.println();
		System.out.println("Last Value deleted of LinkedList ");
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
		curr=head;
		System.out.println();
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		
		//delete at pth value
				int p=2;
				curr=head;
				for(int i=0;i<p;i++) {
					curr=curr.next;
				}
				curr.next=curr.next.next;
				curr=head;
				System.out.println();
				System.out.println("Value added at the kth number of LinkedList ");
				while(curr!=null) {
					System.out.print(curr.data+" ");
					curr=curr.next;
				}
	}
}
