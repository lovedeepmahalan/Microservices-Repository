package Singly_LinkedList_9;

public class FindMiddleElement {

	public static void main(String[] args) {
		NodeForSingly a=new NodeForSingly(2);
		NodeForSingly b=new NodeForSingly(6);
		NodeForSingly c=new NodeForSingly(1);
		NodeForSingly d=new NodeForSingly(7);
		NodeForSingly e=new NodeForSingly(9);
		NodeForSingly f=new NodeForSingly(5);
		NodeForSingly g=new NodeForSingly(8);
		
		NodeForSingly head=a;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		f.next=g;
		
		NodeForSingly fastPointer=head;
		NodeForSingly slowPointer=head;
		while(fastPointer.next!=null && fastPointer.next.next!=null) {
			fastPointer=fastPointer.next.next;
			slowPointer=slowPointer.next;
		}
		System.out.println("Middle point of given LinkedList is ::"+slowPointer.data);
	}
}
