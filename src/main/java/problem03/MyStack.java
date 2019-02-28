package problem03;

public class MyStack {
	
	private String[] buffer;
	private int top;

	public MyStack( int size ) {
		buffer = new String[size];
		top = 0;
	}
	
	public void push(String item) {
		buffer[size()] = item;
		if(buffer.length - 1 != size()) {
			top++;
		}
	}

	public String pop() {
		String popItem = "";
		popItem = buffer[size()];
		if(!isEmpty()) {
			top--;
		}
		return popItem;
	}

	public boolean isFull() {
		return buffer.length == size() ? true : false;
	}
	
	public boolean isEmpty() {
		return size() < 0 ? true : false;
	}
	
	//stack top
	public int size() {
/*		if(isEmpty()) {
			top = 0;
		};*/
		
		return top;
	}
}