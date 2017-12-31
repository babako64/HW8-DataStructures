package ir.maktab.test;
import org.junit.Test;
import ir.maktab.deque.Deque;
import static org.junit.Assert.*;
/**
 * 
 * @author Babak
 *
 */
public class QtestCase {
	/**
	 * Test deque popFront method
	 */
	@Test
	public void QpopFront() {
		
		Deque<Integer> q = new Deque<>();
		q.pushBack(1);
		q.pushBack(2);
		q.pushFront(3);
		Integer temp = q.popFront();
		int t = temp.intValue();
		assertEquals(3,t);
	}
	/**
	 * Test deque popBack method
	 */
	@Test
	public void QpopBack() {
		
		Deque<Integer> q = new Deque<>();
		q.pushBack(1);
		q.pushBack(2);
		q.pushFront(3);
		Integer temp = q.popBack();
		int t = temp.intValue();
		assertEquals(2,t);
	}
	/**
	 * Test deque popSize method
	 */
	@Test
	public void QpopSize() {
		
		Deque<Integer> q = new Deque<>();
		q.pushBack(1);
		q.pushBack(2);
		q.pushFront(3);
		Integer temp = q.size();
		int t = temp.intValue();
		assertEquals(3,t);
	}
}
