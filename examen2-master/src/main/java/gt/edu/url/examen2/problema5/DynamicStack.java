package gt.edu.url.examen2.problema5;

public class DynamicStack<E> implements gt.edu.url.examen2.problema5.Stack<E>{
	
	private int t=-1;

	public DynamicStack() {
		this(CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public DynamicStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	public static final int CAPACITY = 2;
	private E[] data;
	private int size = 0;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		t = t+1;
		return size+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		if (size == data.length)
			resize(2 * data.length);
		data[++t] = e; 
		size++;
	}

	@Override
	public E top() {
		// TODO Auto-generated method stub
		if (isEmpty()) return null;
		return data[t];
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) return null;
		E response = data[t];
		data[t] = null;
		size--;
		t--;
		return response;
	}
	
	protected void resize(int capacity) {
		@SuppressWarnings("unchecked")
		E[] temp = (E[]) new Object[capacity];
		for (int k=0; k < size; k++)
			temp[k] = data[k];
		data = temp;
	}

}
