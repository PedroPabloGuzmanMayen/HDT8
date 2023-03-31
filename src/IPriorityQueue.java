/**
 * 
 * @author Guztavo Cruz, Pedro Pablo Guzmán
 * @version 1.0.0
 *
 * @param <E>
 */
public interface IPriorityQueue<E extends Comparable<E>> {
	/**
	 * Regresa el primer elemento en el queue
	 * @return el primer elemento del queue
	 */
	public E getFirst();
	/**
	 * Borra el primer elemento del queue 
	 * @return el primer elemento del queue 
	 */
	public E remove();
	/**
	 * Agrega un elemento al queue
	 * @param value el elemento que se quiere agregar 
	 */
	public void add(E value);
	/**
	 * Indica si el queue está vacío 
	 * @return true si el queue está vacío, false si no está vacío
	 */
	public boolean isEmpty();
	/**
	 * Indica el tamaño del queue
	 * @return un int que indica el tamaño del queue
	 */
	public int size();
	/**
	 * Elimina todos los elementos del queue
	 */
	public void clear();
}
