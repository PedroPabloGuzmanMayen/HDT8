
public class PriorityQueueFactory {

	public enum PQueue
	{
		VectorHeap, PQueue
	}
	
	/**
	 * @param pq The implementation of the priority queue to create.
	 * @return A new instance of the specified priority queue implementation.
	 * @throws IllegalArgumentException if an invalid implementation is specified.
	 */
	public static <E extends Comparable <E>> IPriorityQueue<E> createPQ(PQueue pq)
	{
		switch(pq)
		{
			// If the implementation specified is VectorHeap, return a new instance of VectorHeap.
			case VectorHeap:
				return new VectorHeap<>();
			// If the implementation specified is PQueue, return a new instance of pQueue.
			case PQueue:
				return new pQueue<>();
			// If the implementation specified is invalid, throw an IllegalArgumentException.
			default:
				throw new IllegalArgumentException("Invalid implementation");
		}
	}
}
