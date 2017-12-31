package ir.maktab.stack;

import ir.maktab.collection.Collection;
import ir.maktab.exceptions.OverflowExeption;
import ir.maktab.exceptions.UnderflowException;

/**
 * 
 * @author Babak
 *
 * @param <E>
 */
public class Stack<E> implements Collection<E> {

	private int maxSize;
	private Node<E> first=null;
	private Node<E> last=null;
	public int size=0;
	
	/**
	 * Stack class constructor
	 * @param {int} maxSize
	 */
	public Stack(int maxSize) {
		this.maxSize = maxSize;
	}
	
	/**
	 * Get Max size of stack
	 * @return
	 */
	public int getMaxSize() {
		
		return maxSize;
	}
	/**
	 * Return element of index of i
	 * @param i
	 * @return
	 */
	public E get(int i) {
		Node<E> temp ;
		
		if(i<=size()) {
		temp=first;
		for(int j=2;j<=i;j++) {
			temp=temp.getNext();
		}
		}else {
			throw new IndexOutOfBoundsException("size is out of exeption");
		}
		return temp.getData();
	}
	/**
	 * Change size of maxSize
	 * @param newSize
	 */
	public void resize(int newSize) {
		
		if(newSize>=maxSize) {
			maxSize=newSize;
		}else {
			Node<E> temp ;
			temp=first;
			for(int j=2;j<=newSize;j++) {
				temp=temp.getNext();
			}
			last=temp;
			last.setNext(null);
			maxSize=newSize;
		}
	}
	/**
	 * Insert new element in stack
	 * @param var
	 */
	public void push(E var) {
		
		if(size<maxSize) {
		Node<E> node = new Node<E>();
		if(first==null) {
		node.setData(var);
		node.setNext(null);
		last=node;
		first=node;
		size++;
		}else {
			node.setData(var);
			node.setNext(null);
			last.setNext(node);
			last=node;
			size++;
		}
		}else {
			throw new OverflowExeption("stack is full");
		}
	}
	/**
	 * Return top element
	 * @return
	 */
	public E top() {
		
		if(last==null)
			return null;
		else
			return last.getData();
	}
	/**
	 * Return and remove top element
	 * @return
	 */
	public E pop() {
		
		Node<E> temp ;
		if(!isEmplty()) {
		temp = last;
		Node<E> next;
		next = first;
		for(int i=2;i<size;i++) {
			next=next.getNext();
		}
		last=next;
		size--;
		}else {
			throw new UnderflowException();
		}
		return temp.getData();
	}
	/**
	 * Return size of stack
	 */
	@Override
	public int size() {
		
		return size;
	}
	/**
	 * Remove all elements
	 */
	@Override
	public void clear() {
		
		first=null;
		last=null;
		size=0;
	}
	/**
	 * Return true if stack is empty
	 */
	@Override
	public boolean isEmplty() {
		
		return size==0?true:false;
	}

	@Override
	public boolean contains(E var) {
		Node<E> temp ;
		temp=first;
		for(int i=2;i<=size;i++) {
			if(temp.getData()==var) {
				return true;
			}
			temp=temp.getNext();
		}
		return false;
	}
}
