package ir.maktab.deque;

public class Qnode<E> {
	private E data;
	private Qnode<E> next;
	private Qnode<E> back;
	
	public Qnode() {
		
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Qnode<E> getNext() {
		return next;
	}

	public void setNext(Qnode<E> next) {
		this.next = next;
	}

	public Qnode<E> getBack() {
		return back;
	}

	public void setBack(Qnode<E> back) {
		this.back = back;
	}
	
}
