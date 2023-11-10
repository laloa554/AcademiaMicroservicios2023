package EstructuraDeDatos.queue;

import EstructuraDeDatos.linkedList.LinkedList;

public class DynamicQueue extends LinkedList implements Queue{

	@Override
	public void enqueue(int number) {
		super.inssertAtTheEnd(number);
	}
	@Override
	public void dequeuer() {
		super.deleteAtHead();
	}
	@Override
	public void showQueue() {
		super.show();
	}
	@Override
	public void topQueue() {
		super.showHead();
	}
}
