/** 
 * listNode class to define an element of the LinkedList class.
 * This class will implement a singley linked list. 
 * As member fields will be private, this class needs getters and setters. 
 */

public class listNode{ 
	private Object element;
	private listNode next;

	/** 
     * Constructor to create a new list node
     */
	public listNode(Object element) { 
		this.element = element;
		this.next = null;
	}
	/**
	 * Get the data stored in this element
     */
	public Object getElement() { 
		return element;
	}
	/**
	 * Move to next node
	 */
	public listNode getNext() { 
		return next;
	}

	/** 
	 * Set the next node
	 */
	public void setNext(listNode nextNode) {
		this.next = nextNode;
	}

}	