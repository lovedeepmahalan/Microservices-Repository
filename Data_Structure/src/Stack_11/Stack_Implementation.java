package Stack_11;

import java.util.Stack;

public class Stack_Implementation {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(12);
		stack.push(45);
		stack.push(36);
		stack.push(67);
		stack.push(21);
		
		System.out.println("st.search(36) :: "+stack.search(36));//3
		System.out.println("stack.search(89) ::"+stack.search(89));//-1
		System.out.println("peek ::" +stack.peek());//last element which is 21
		System.out.println("size of stack ::" +stack.size());//5
		System.out.println("empty :: "+stack.empty());//false
		System.out.println("remove an element ::"+stack.pop());//remove the element 21
		System.out.println("capacity is :: "+stack.capacity());
	}
}
