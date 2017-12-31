package ir.maktab.stack;

import ir.maktab.collection.Collection;
import ir.maktab.exceptions.OverflowExeption;
import ir.maktab.exceptions.UnderflowException;

public class Stack<E> implements Collection<E> {

	private int maxSize;
	private Node<E> first=null;
	private Node<E> last=null;
	public int size=0;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> sk = new Stack<>(3);
//		sk.pushBack(1);
//		sk.pushBack(2);
//		sk.pushFront(3);
//		sk.pushFront(4);
		
//		sk.add(7);
//		sk.add(4);
//		sk.add(2);
//		sk.add(3);
//		sk.add(8);
//		sk.add(9);
//		sk.add(5);
		
		sk.push(1);
		sk.push(2);
		sk.push(3);
		//sk.push(4);
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
//		System.out.println(sk.popFront());
		
		//System.out.println(sk.getMinElement());
	//	System.out.println(sk.getMaxElement());
		
	}
	
	public int getMaxSize() {
		
		return maxSize;
	}
	
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
	
	public E top() {
		
		if(last==null)
			return null;
		else
			return last.getData();
	}
	
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

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public void clear() {
		
		first=null;
		last=null;
		size=0;
	}

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
