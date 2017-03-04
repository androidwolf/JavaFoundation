package PopMaxNum;

import java.util.Stack;

public class PopMaxNum2 {

	public Stack<Integer> stack = new Stack<Integer>();
	public Stack<Integer> stack2 = new Stack<Integer>();

	public void push(Integer num) {
		stack.push(num);
		if (stack2.isEmpty()) {
			stack2.push(num);
		} else {
			if (num > stack2.peek()) {
				stack2.push(num);
			}
		}
	}

	public int popMaxNum() {
		int temp = stack.pop();
		if (temp == stack2.peek()) {
			return stack2.pop();
		} else if (temp > stack2.peek()) {
			return temp;
		} else {
			return stack2.peek();
		}
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		PopMaxNum2 pmn = new PopMaxNum2();
		pmn.push(0);
		pmn.push(1);
		pmn.push(4);
		pmn.push(4);
		pmn.push(5);
		pmn.push(4);
		pmn.push(5);
		
		while (!pmn.isEmpty()) {
			System.out.println("current max : " + pmn.popMaxNum());
		}
	}
}
