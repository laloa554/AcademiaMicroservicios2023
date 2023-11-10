package EstructuraDeDatos.stack;

public class StaticStack implements Stack{
	private int []stack;
	private int top;
	
	public StaticStack(int size) {
		this.stack = new int[size];
		this.top = 0;
	}
	
	@Override
	public void pop() {
		if(!isEmpty()) {
			top--;
			System.out.println("The number "+stack[top]+" has been deleted");
		}
	}

	@Override
	public void topStack() {
		System.out.println("The number "+stack[top-1]+" is the top");
	}

	@Override
	public boolean isEmpty() {
		if(stack == null || top == 0) {
			System.out.println("The stack is empty");
			return true;
		}
		return false;
	}

	@Override
	public void push(int number) {
		if(top != stack.length) {
			stack[top] = number;
			top++;
			System.out.println("The number "+number+" has been added");
			return;
		}
		System.out.println("The stack is full");
	}

	@Override
	public void showStack() {
		for(int i = 0; i<top; i++) {
			System.out.print("[ " + stack[i] +" ]");
		}
	}

}
