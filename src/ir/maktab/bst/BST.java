package ir.maktab.bst;

import ir.maktab.collection.Collection;

/**
 * 
 * @author Babak
 *
 * @param <E>
 */
public class BST<E extends Comparable<E>> implements Collection<E>,Comparable<E> {
	Bnode<E> root=null ;
	private int size=0;
	
	@Override
	public int size() {
		
		return size;
	}

	@Override
	public void clear() {
		
		root=null;
	}

	@Override
	public boolean isEmplty() {
		
		return size==0?true:false;
	}
	/**
	 * Return element if contain in deque
	 */
	@Override
	public boolean contains(E var) {
		
		Bnode<E> temp=root;
		
		if(temp!=null) {
		while(temp!=null) {
			
			if(temp.getData()==var) {
				return true;
			}else if(temp.getData().compareTo(var)>0){
				temp=temp.getLeft();
			}else {
				temp=temp.getRight();
			}
				
			}
		}
		
		return false;
	}
	/**
	 * Add element to deque
	 * @param var
	 */
	public void add(E var) {
	
		Bnode<E> temp;
		Bnode<E> node = new Bnode<>();
		node.setData(var);
		
		if(root==null) {
			root=node;
			root.setLeft(null);
			root.setRight(null);
			//System.out.println("root");
		}else {
			temp=root;
			while(true) {
				
				if(node.getData().compareTo(temp.getData())<0) {
					
					if(temp.getLeft()==null) {
						temp.setLeft(node);
						//System.out.println("L add");
						size++;
						return;
					}
					temp = temp.getLeft();
				}else {
					
					if(temp.getRight()==null) {
						temp.setRight(node);
						//System.out.println("R add");
						size++;
						return;
					}
					temp = temp.getRight();
				}
				
			}
			
		}
	}
	/**
	 * Return min element of deque
	 * @return
	 */
	public E getMinElement() {
		
		Bnode<E> temp=root;
		
		if(temp!=null) {
		while(temp.getLeft()!=null) {
			
			temp=temp.getLeft();
				
			}
		}
		
		return temp.getData();
	}
	/**
	 * Return max element of deque
	 * @return
	 */
	public E getMaxElement() {
		
		Bnode<E> temp=root;
		
		if(temp!=null) {
		while(temp.getRight()!=null) {
			
			temp=temp.getRight();
				
			}
		}
		
		return temp.getData();
	}
	/**
	 * compare to element
	 */
	@Override
	public int compareTo(E arg0) {
		
		int result= this.compareTo(arg0);
		if(result==0) {
			return 0;
		}else 
		return result<0?-1:1;
	}
}
