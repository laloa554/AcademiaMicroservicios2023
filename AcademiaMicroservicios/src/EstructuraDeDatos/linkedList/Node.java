package EstructuraDeDatos.linkedList;

public class Node {
	/**
	 * Integer number.
	 * */
	private int number;
	
	/**
	 * Node object.
	 * */
	private Node next;
	
	/**
	 * Constructor
	 * */
	public Node() {
		this.number = 0;
		this.next = null;
	}
	
	/**
	 * This method returns an integer number.
	 * @return a integer number.
	 **/
    public int getNumber() {
    	return number;
    }
    
    /**
     * This method receives an integer number and sets the valor to class variable.
     * @param integer number.
     * */
    public void setNumber(int number) {
    	this.number = number;
    }
    
    /**
     * this method returns a Node object.
     * @return Node object.
     * */
    public Node getNext() {
    	return next;
    }
    
    /**
     * This method receives an Node object and sets the valor to class variable.
     * @param Node object.
     * */
    public void setNext(Node next) {
    	this.next = next;
    } 
}