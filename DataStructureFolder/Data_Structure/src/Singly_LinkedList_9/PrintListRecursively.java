package Singly_LinkedList_9;


public class PrintListRecursively {

	public static void main(String[] args) {
		Node a= new Node(3);
		Node b= new Node(5);
		Node c= new Node(4);
		Node d= new Node(8);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=null;
		
		
		printList(a);
	}

	private static void printList(Node a) {
		if(a.next==null) {
			System.out.print(a.data);
			return;
		}
		System.out.print(a.data+"->");
		printList(a.next);
		
	}
}
