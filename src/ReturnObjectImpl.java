/**
 * An implementation of the ReturnObject interface 
 */
 public class ReturnObjectImpl implements ReturnObject { 
	private Object returnValue;
	private ErrorMessage errorType; 
	
	/** 
	 * returnObjectImpl constructer for a successful operation.
	 * The return value of the class is the object, and the error message
	 * displays no error.
	 */
	public ReturnObjectImpl(Object obj) { 
		this.returnValue = obj;
		this.errorType = ErrorMessage.NO_ERROR;
	}
 
	/** 
	 * returnObjectImpl constructor for failed operation.
	 * return value is null and the error message is set.
	 */
	public ReturnObjectImpl(ErrorMessage error) {
		this.returnValue = null;
		errorType = error;
	}
 
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 */
	public boolean hasError(){
		if (errorType == ErrorMessage.NO_ERROR) { 
			return false;
		} else { 
			return true;
		}
	}
	
	/**
	 * Returns the error message. 
	 * 
	 * This method must return NO_ERROR if and only if
	 * {@hasError} returns false.
	 * 
	 * @return the error message
	 */
	public ErrorMessage getError(){
		return errorType;
	}
	
	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been an error.
	 * 
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an error
	 */
	public Object getReturnValue(){
		if (hasError()) { 
			returnValue = null;
			return returnValue;
		} else { 
			return returnValue;
		}
	}
	
 
 }