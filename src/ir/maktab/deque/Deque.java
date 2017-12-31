package ir.maktab.deque;

import ir.maktab.collection.Collection;
import ir.maktab.exceptions.UnderflowException;
import ir.maktab.stack.Node;

public class Deque<E> implements Collection<E> {
	private Qnode<E> first=null;
	private Qnode<E> last=null;
	private int size=0;
	
	public void pushBack(E var) {
		
		Qnode<E> node = new Qnode<>();
		if(last!=null) {
		node.setData(var);
		node.setNext(last);
		node.setBack(null);
		last=node;
		size++;
		}else {
			node.setData(var);
			node.setNext(last);
			node.setBack(null);
			last=node;
			first=node;
			size++;
		}
	}
	public void pushFront(E var) {
		Qnode<E> node = new Qnode<>();
		if(first!=null) {
		node.setData(var);
		node.setNext(null);
		node.setBack(first);
		first.setNext(node);
		first=node;
		size++;
		}else {
			node.setData(var);
			node.setNext(null);
			node.setBack(first);
			first=node;
			last=node;
			size++;
		}
	}
	public E front() {
		return first.getData();
	}
	public E back() {
		return last.getData();
	}
	public E popFront() {	
		Qnode<E> temp;
		if(!isEmplty()) {
		if(first.getBack()!=null) {
		temp = first;
		first=first.getBack();
		first.setNext(null);
		size--;
		}else {
			temp = first;
			first=null;
			size--;
		}
		}else {
			throw new UnderflowException();
		}
		return temp.getData();
	}
	public E popBack() {
		Qnode<E> temp;
		if(!isEmplty()) {
		if(last.getNext()!=null) {
		temp=last;
		last=last.getNext();
		last.setBack(null);
		size--;
		}else {
			temp=last;
			last=null;
			size--;
		}
		}else {
			throw new UnderflowException();
		}
		return temp.getData();
	}
	public E getElement(int i) {
		Qnode<E> temp ;
		if(i<size) {
		temp=first;
		for(int J=2;J<=size;J++) {
			
			temp=temp.getNext();
		}
		}else {
			throw new IndexOutOfBoundsException();
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
		
		Qnode<E> temp ;
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
