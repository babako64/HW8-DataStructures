package ir.maktab.bst;

public class Bnode<E> {
	private E data;
	private Bnode<E> left;
	private Bnode<E> right;
	
	public Bnode() {
		
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Bnode<E> getLeft() {
		return left;
	}

	public void setLeft(Bnode<E> left) {
		this.left = left;
	}

	public Bnode<E> getRight() {
		return right;
	}

	public void setRight(Bnode<E> right) {
		this.right = right;
	}

}
