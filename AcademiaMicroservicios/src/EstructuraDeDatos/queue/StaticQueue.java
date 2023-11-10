package EstructuraDeDatos.queue;

public class StaticQueue implements Queue {
	private int[] queue;
	private int front;
	private int back;

	public StaticQueue(int size) {
		this.queue = new int[size];
		this.front = 0;
		this.back = -1;
	}

	@Override
	public void enqueue(int number) {
		if (back == queue.length-1) {
			System.out.println("the queue is full");
		} else {
			back++;
			queue[back] = number;
			System.out.println("the number "+number+" has been added");
		}
	}

	@Override
	public void dequeuer() {
		if (back == -1) {
			System.out.println("the queue is empty");
		} else {
			System.out.println("the number "+queue[front]+" has been deleted");
			for(int i = front; i<back; i++) {
				queue[i] = queue[i+1];
			}
			queue[back] = -1;
			back--;
		}
	}

	@Override
	public void showQueue() {
		if(back != -1) {
			for(int i = front; i<=back; i++) {
				System.out.print("[ " + queue[i] +" ]");
			}
			System.out.println("");
			return;
		}
		System.out.println("the queue is empty");
	}

	@Override
	public void topQueue() {
		System.out.println("[ " + queue[front] +" ]");
	}
}
