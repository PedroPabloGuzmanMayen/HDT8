import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorHeapTest {
	public static IPriorityQueue<Integer> pq = new VectorHeap<Integer>();
	@Test
    public void testAdd() {
        pq.add(90);
        pq.add(10);
        pq.add(30);
        pq.add(150);
        pq.add(55);
        assertEquals(5, pq.size());
        assertEquals(10, pq.getFirst().intValue());
    }
	@Test
	public void testRemove() {
		pq.remove();
		assertEquals(30, pq.getFirst().intValue());
		assertEquals(4, pq.size());
	}

}
