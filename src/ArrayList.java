/** 
 * An implementation of List based on arrays
 *
 * @author Nick Montague
 */ 
 
 public class ArrayList implements List { 
	private int arraySize = 0;
	private Object[]  array = new Object[0];
	
	/**
	 * @see List#isEmpty
	 */
	public boolean isEmpty(){ 
		if (this.size() == 0) { 
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @see List#size
	 */
	public int size() { 
		return arraySize;
	}
	
	/**
	 * @see List#get
	 */
	public ReturnObject get(int index) { 
		if (this.isEmpty()) { 
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= this.size()) { 
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else { 
			return new ReturnObjectImpl(array[index]);
		}
	}
	
	/**
	 * @see List#remove
	 */
	public ReturnObject remove(int index) { 
	// DRY - create a method to avoid repetition of this code.
		if (this.isEmpty()) { 
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		} else if (index < 0 || index >= this.size()) { 
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		} else { 
			Object objectToRemove = array[index];
			for (int i = index + 1; i < this.arraySize;i++) { 
				array[i-1] = array[i];
			}
			arraySize--;
			return new ReturnObjectImpl(objectToRemove);
		}
	}
	
	/**	
	 * @see List#add(int index, Object item)
	 */
	public ReturnObject add(int index, Object item) { 
		return null;
	}
	
	/** 
	 * @see List#add(Object item)
	 */
	public ReturnObject add(Object item){ 
		return null;
	}
 
 
 
 
 
 }
 
 