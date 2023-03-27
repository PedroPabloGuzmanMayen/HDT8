
public interface IPriorityQueue<E extends Comparable<E>> {
	/**
	 * 
	 * @return
	 */
	public E getFirst();
	/**
	 * 
	 * @return
	 */
	public E remove();
	/**
	 * 
	 * @param value
	 */
	public void Add(E value);
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
	/**
	 * 
	 * @return
	 */
	public int size();
	/**
	 * 
	 */
	public void clear();
}
