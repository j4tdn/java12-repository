package generic;

import java.lang.reflect.Array;

public  class JavaList<E> implements Ilist<E> {
	private int initialCapacity =10;
	private int size;
 private E[] elemements;
 
 public JavaList() {
	 elemements = create(0);
 }
 public JavaList(int capacity) {
	 if(capacity < 0) {
		 throw new IllegalArgumentException("Capacity should be greater than 0");
	 }
	 elemements=create(capacity<initialCapacity ?initialCapacity:capacity);
 }
 @SuppressWarnings("unchecked")
public E[] create(int size) {
	 return (E[])Array.newInstance(Object.class, size);
 }
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean add(E e) {
		if(size<initialCapacity) {
			elemements[size++]=e;
			return true;
		}
		E[] newElements=create(size+1);
		for(int i=0;i<size;i++);
		return true;
	}

	@Override
	public boolean remove() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int i) {
		if(i<0||i>=size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return null;
	}

	@Override
	public void get(int i, E t) {
		// TODO Auto-generated method stub
		
	}

}
