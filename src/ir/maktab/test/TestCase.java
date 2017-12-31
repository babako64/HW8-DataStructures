package ir.maktab.test;
import org.junit.Test;

import ir.maktab.stack.Stack;
import static org.junit.Assert.*;

public class TestCase {

	@Test
	public void stackTop() {
		Stack<Integer> sk = new Stack<>(2);
		sk.push(1);
		sk.push(2);
		Integer temp = sk.top();
		int t = temp.intValue();
		assertEquals(2,t);
	}
	
	@Test
	public void stackPop() {
		Stack<Integer> sk = new Stack<>(2);
		sk.push(1);
		sk.push(2);
		Integer temp = sk.pop();
		temp = sk.top();
		int t = temp.intValue();
		assertEquals(1,t);
	}
	
	@Test
	public void stackContaine() {
		Stack<Integer> sk = new Stack<>(2);
		sk.push(1);
		sk.push(2);
		assertEquals(true,sk.contains(1));
	}
}
