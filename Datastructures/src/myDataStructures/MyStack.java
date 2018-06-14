package myDataStructures;


public class MyStack<X> {
	private X[] data;
	private int stackPointer;

	public MyStack() {
		data = (X[]) new Object[1000];
		stackPointer = 0;
	}

	public void push(X newItem) {
		data[stackPointer++] = newItem;
	}

	public X pop() {
		if (stackPointer == 0) {
			throw new IllegalStateException("No more items on the stack");

		}
		return data[--stackPointer];
	}

	public boolean contains(X item) {
		boolean result = false;
		for (int i = 0; i < stackPointer; i++) {
			if (item.equals(data[i])) {
				result = true;
				break;
			}
		}
		return result;

	}
	
	public X access(X item) {
		while(stackPointer>0) {
			X poppedItem = pop();
		if(poppedItem==item)
			return poppedItem;
	}
		throw new IllegalArgumentException("could not find the element"+item);
		}
	
	public int size() {
		return stackPointer;
				
	}
}
