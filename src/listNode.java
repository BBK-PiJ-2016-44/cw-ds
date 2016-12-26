/** 
 * listNode class to define an element of the LinkedList class.
 * This class will implement a singley linked list. 
 * As member fields will private, this class needs getters and setters. 
 */

public class listNode{ 
	private Object element;
	private int index;
	private listNode next = null;

	/** 
     * Constructor to create a new list node
     */
	public listNode(Object element, int index) { 
		this.element = element;
		this.index = index;
	}

	public Object getElement() { 
		return element;
	}

	public listNode getNext() { 
		return next;
	}

	public int getIndex() { 
		return index;
	}

	public void setNext(listNode nextNode) {
		this.next = next;
	}


}