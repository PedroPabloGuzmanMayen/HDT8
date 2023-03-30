// Implementation of IPriorityQueue using Java's PriorityQueue class
import java.util.PriorityQueue;

public class pQueue<E extends Comparable<E>> implements IPriorityQueue<E>
{
	// PriorityQueue to store elements
	private PriorityQueue<E> pQueue;

	// Constructor to initialize the PriorityQueue
	public pQueue() {
		pQueue = new PriorityQueue<E>();
	}
	
	// Returns the highest priority element without removing it from the queue
	@Override
	public E getFirst() {
		return pQueue.peek();
	}

	// Removes and returns the highest priority element from the queue
	@Override
	public E remove() {
		return pQueue.poll();
	}

	// Inserts the given element into the queue according to its priority
	@Override
	public void add(E value) {
		pQueue.add(value);
	}

	// Returns true if the queue is empty, false otherwise
	@Override
	public boolean isEmpty() {
		boolean b = (pQueue.isEmpty()) ? true:false;
		return b;
	}

	// Returns the number of elements in the queue
	@Override
	public int size() {		
		return pQueue.size();
	}

	// Removes all elements from the queue
	@Override
	public void clear() {
		pQueue.clear();
	}
}


