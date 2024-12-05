package Singly_LinkedList_9;

public class ReverseTheList {

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
		
		NodeForSingly curr=head;
		NodeForSingly prev=null;
		NodeForSingly nxt=null;
		
		while(curr!=null) {
			nxt=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nxt;
		}
        // Update the head to the new head (prev points to the new head)
		head=prev;
		
		//printing the list
		curr=head;// Start from the new head
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}
}
