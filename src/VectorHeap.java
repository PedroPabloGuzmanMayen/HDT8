import java.util.Vector;
/**
 * 
 * @author Guztavo Cruz, Pedro Pablo Guzmán
 * @Version 1.0.0
 *
 * @param <E>
 */
public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E>
{


	protected Vector<E> data; // the data, kept in heap order

	public VectorHeap()
	// post: constructs a new priority queue
	{
		data = new Vector<E>();
	}
/**
 * Construye un nuevo vectorHeap 
 * @param v un vector el cuál contendrá los datos almacenados en el vector heap
 */
	public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
		int i;
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}
	/**
	 * Obtiene al padre de cada valor insertado en el VectorHeap
	 * @param i el valor del cual se quiere saber el padre
	 * @return el padre del valor indicado
	 */
	protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
		return (i-1)/2;
	}
/**
 * Obtiene al hijo izquierdo de un valor
 * @param i el valor del cual se quiere saber el hijo
 * @return el hijo izquierdo del valor indicado
 */
	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
		return 2*i+1;
	}
/**
 * Obtiene al hijo derecho de un valor indicado
 * @param i al valor del cuál se quiere saber el hijo derecho
 * @return el hijo derecho del valor indicado
 */
	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
		return (2*i+1) + 1;
	}
/**
 * Se encarga de intercambiar un valor si este es menor que un valor que está por encima de él 
 * @param leaf el valor a intercambiar 
 */
	protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}
	@Override
	public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
		data.add(value);
		percolateUp(data.size()-1);
	}
/**
 * Mueve hacia abajo un valor si se encuentra un valor que sea menor que él
 * @param root el valor que se debe mover hacia abajo
 */
	protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}
	@Override
	public E remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

	@Override
	public E getFirst() {
		return data.get(0);
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public void clear() {
		data.clear();
		
	}
	
}
