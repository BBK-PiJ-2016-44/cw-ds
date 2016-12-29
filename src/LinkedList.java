/** 
 * An implementation of List based on pointers
 *
 * @author Nick Montague
 */ 
 
 public class LinkedList implements List{ 
	private listNode firstNode;
	private int listSize;
		
	/** 
	 * LinkedList constructor
	 */
	public LinkedList(){
		firstNode = null;
		listSize = 0;
	}

	/**
     * Checks if list is empty
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty(){
		return (this.size() == 0);
	}
		
	/** Get number of elements in the list.
	 * This is essential because listSize is private
	 * @return size of list
	 */
	public int size(){
		return listSize;
	}
	
	
	public ReturnObject get(int index){
		if (checkError(index) != null){
			return (checkError(index));
		}

		listNode currentNode = firstNode;
		for (int i = 0; i < index; i++){
			currentNode = currentNode.getNext();
		}
		return new ReturnObjectImpl(currentNode.getElement());
	}

	public ReturnObject remove(int index){

		if (isEmpty()){ 
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}
		if (index >= (size()) || index < 0){ // Invalid index
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		if (index == 0){ 
			
		}
		listSize--;
		return null;

	}

	/** 
	 * Add an item to a selected point in the list
	 */
	@Override 
	public ReturnObject add(int index, Object item){

		if (item == null){ // Null item
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}
		if (index > (size() + 1) || index < 0){ // Invalid index
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		listNode newNode = new listNode(item);
		if (isEmpty()){ // Empty list
			firstNode = newNode;
			listSize++;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}

		listNode currentNode = firstNode;
		while (currentNode.getNext() != null){ 
			if (size() == index - 1){
				newNode.setNext(currentNode.getNext());
				currentNode.setNext(newNode);
			}
			currentNode = currentNode.getNext();
		}
		listSize++;
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}	

	/**
	 * Add an item to the end of the list
	 */
	@Override
	public ReturnObject add(Object item){
		
		if (item == null){ // Null item
			return new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		}

		listNode newNode = new listNode(item);
		if (isEmpty()){ // Empty list
			firstNode = newNode;
			listSize++;
			return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		}

		listNode currentNode = firstNode;
		while (currentNode.getNext() != null){
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(newNode);
		listSize++;
		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	/**
	 * Method to check if list is empty or index is invalid
	 * @return null if valid, ErrorMessage Enum if invalid
	 */
	private ReturnObject checkError(int index){
		if (this.size() == 0){
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index > this.size()){
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else { 
			return null;
		}
	}
 }