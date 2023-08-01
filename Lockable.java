
public interface Lockable {

	/**
	 * Setter for the key
	 * @param key to set
	 */
	
	void setKey(int key);
	
	/**
	 * Check if the object is locked
	 * @return true if is locked, false if not
	 */
	boolean isLocked();
	
	void lock(int key);
	
	void unlock(int key);
	
	
}
