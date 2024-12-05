package DoublyAndCircularLinkedList_10;

public class PrintDoublyList {

	public static void main(String[] args) {
		DoublyNode a=new DoublyNode(6);
		DoublyNode b=new DoublyNode(3);
		DoublyNode c=new DoublyNode(7);
		DoublyNode d=new DoublyNode(4);
		DoublyNode e=new DoublyNode(9);
		DoublyNode f=new DoublyNode(1);
		DoublyNode g=new DoublyNode(5);
		
		DoublyNode head=a;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		g.next=null;
		g.prev=f;
		f.prev=e;
		e.prev=d;
		d.prev=c;
		c.prev=b;
		b.prev=a;
		a.prev=null;
		
		DoublyNode curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
