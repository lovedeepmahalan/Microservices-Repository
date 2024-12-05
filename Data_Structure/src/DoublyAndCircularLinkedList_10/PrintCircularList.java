package DoublyAndCircularLinkedList_10;

public class PrintCircularList {

	public static void main(String[] args) {
		SinglyNode a=new SinglyNode(9);
		SinglyNode b=new SinglyNode(7);
		SinglyNode c=new SinglyNode(5);
		SinglyNode d=new SinglyNode(4);
		SinglyNode e=new SinglyNode(7);
		SinglyNode f=new SinglyNode(1);
		SinglyNode g=new SinglyNode(3);
		
		SinglyNode head=a;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		g.next=head;
		
		SinglyNode curr=head;
		System.out.println("CircularLinkedList is printing");
		while(curr.next!=head) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
}
