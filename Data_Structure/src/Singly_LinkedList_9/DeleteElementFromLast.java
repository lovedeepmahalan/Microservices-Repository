package Singly_LinkedList_9;

public class DeleteElementFromLast {

	public static void bySinglePointer(int k) {
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
		int pointer =0;
		while(curr.next!=null) {
			curr=curr.next;
			pointer++;
		}
		//if k is invalid
		if (k > pointer || k <= 0) {
            System.out.println("Invalid value of k");
            return;
        }
		if(k==pointer) {
			head=head.next;
		}else {
		curr=head;
		for(int i=0;i<pointer-k;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		
		curr=head;
		while(curr!=null) {
			System.out.print(curr.data +" ");
			curr=curr.next;
		}
		}
	}
	
	public static void byDoublePointer(int k) {
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
		
		
		for(int i=1;i<=k;i++) {
			fastPointer=fastPointer.next;
		}
		
		while(fastPointer.next!=null) {
			fastPointer=fastPointer.next;
			slowPointer=slowPointer.next;
		}
		slowPointer.next=slowPointer.next.next;
		
		//printing the list
		slowPointer=head;
		while(slowPointer!=null) {
			System.out.print(slowPointer.data +" ");
			slowPointer=slowPointer.next;
		}
	}
	public static void main(String[] args) {
		bySinglePointer(3);
		System.err.println();
		byDoublePointer(3);
	}
}
