package stackImplementation;

import java.util.Stack;

public class PUsh_element_atBottom {

	public static void pushAtBottom(int data, Stack<Integer> stack) {
		if(stack.isEmpty()) {
			stack.push(data);
			return;
		}
		int top = stack.pop();
		pushAtBottom(data, stack);
		stack.push(top);
	}
	
	public static void reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int top = stack.pop();
		reverse(stack);
		pushAtBottom(top, stack);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
