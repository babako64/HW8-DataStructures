package ir.maktab.test;

import org.junit.Test;

import ir.maktab.bst.BST;

import static org.junit.Assert.*;

public class BSTtestCase {

	@Test
	public void getMinTest() {
		
		BST<Integer> b = new BST<>();
		b.add(5);
		b.add(4);
		b.add(6);
		Integer temp = b.getMinElement();
		int t = temp.intValue();
		assertEquals(4,t);
	}
	@Test
	public void getMaxTest() {
		
		BST<Integer> b = new BST<>();
		b.add(5);
		b.add(4);
		b.add(6);
		Integer temp = b.getMaxElement();
		int t = temp.intValue();
		assertEquals(6,t);
	}
	
	@Test
	public void contain() {
		
		BST<Integer> b = new BST<>();
		b.add(5);
		b.add(4);
		b.add(6);
		assertEquals(true,b.contains(5));
	}
}
