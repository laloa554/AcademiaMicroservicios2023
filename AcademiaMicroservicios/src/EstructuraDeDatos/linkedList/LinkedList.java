package EstructuraDeDatos.linkedList;

public class LinkedList {
	
	/**
	 * Node object.
	 */
	private Node head;

	/**
	 * Linked list's size.
	 */
	private int size;

	/**
	 * Constructor.
	 */
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

	/**
	 * This method checks if there is a linked list.
	 * 
	 * @return boolean variable.
	 */
	private boolean isEmpty() {
		return head == null ? true : false;
	}

	public int getSize() {
		return size;
	}

	/**
	 * This method inserts a number at the end of the linked list.
	 */
	public void inssertAtTheEnd(int number) {
		Node node = new Node();
		node.setNumber(number);
		if (isEmpty()) {
			head = node;
		} else {
			Node aux = head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(node);
		}
		size++;
	}
	
	public void deleteAtTheEnd() {
		if(!isEmpty()) {
			int i = size;
			int count = 1;
			Node aux = head;
			
			while(aux.getNext() != null ) {
				if(i-count==1) {
					aux.setNext(null);
				}else {
					aux = aux.getNext();
				}
				count++;			
			}
			size--;
		}
	}

	/**
	 * This method inserts a number at the head of the linked list.
	 */
	public void inssertAtHead(int number) {
		Node node = new Node();
		node.setNumber(number);
		if (isEmpty()) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		size++;
	}

	/**
	 * this method deletes the linked list's head.
	 */
	public void deleteAtHead() {
		if (!isEmpty()) {
			head = head.getNext();
		}
	}

	/**
	 * this method deletes the linked list.
	 */
	public void delete() {
		head = null;
		size = 0;
	}

	public void searchNumber(int number) throws Exception {
		Node aux = head;
		boolean flag = false;
		int i = 0;
		while (aux.getNext() != null && flag == false) {
			if (aux.getNumber() == number) {
				flag = true;
				System.out.println("the number " + number + " was find on the position: " + i);
			} else {
				aux = aux.getNext();
				i++;
			}
			throw new Exception("The number did not find in the linked list");
		}
	}

	/**
	 * this method shows the linked list.
	 */
	public void show() {
		if (!isEmpty()) {
			Node aux = head;
			int i = 0;
			while (aux != null) {
				System.out.print(i + ".[ " + aux.getNumber() + " ]" + " ->  ");
				aux = aux.getNext();
				i++;
			}
			System.out.println("");
		} else {
			System.out.println("The linked list is empty");
		}
	}

	public void showTheLast() {
		if (!isEmpty()) {
			Node aux = head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			System.out.println(aux.getNumber());
			return;
		}
		
		System.out.println("The queue is empty");
	}
	
	public void showHead() {
		if (!isEmpty()) {
			System.out.print("[ " + head.getNumber() + " ]" + " ->  ");
			return;
		}	
		System.out.println("The queue is empty");
	}
}
