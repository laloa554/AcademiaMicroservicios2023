package EstructuraDeDatos.stack;

import EstructuraDeDatos.linkedList.LinkedList;

public class DynamicStack extends LinkedList implements Stack{
	
	private DynamicStack dynamicStack; 
	
	/*public DynamicStack() {
		super();
	}*/

	@Override
	public void pop() {
		super.deleteAtTheEnd();
	}

	@Override
	public boolean isEmpty() {
		dynamicStack.isEmpty();
		return true;
	}

	@Override
	public void push(int number) {
		super.inssertAtTheEnd(number);
	}

	@Override
	public void showStack() {
		super.show();
	}

	@Override
	public void topStack() {
		super.showTheLast();
	}

}
