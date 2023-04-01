import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void Addtest() {
		Process process = new Process("anónimo23", "Doom Eternal", 15);
		
		VectorHeap<Process> vector = new VectorHeap<Process>();
		vector.add(process);
		String expected = "anónimo23";
		assertEquals(expected, vector.getFirst().getUsername());
		
	}
	@Test
	void removeTest() {
		Integer value1 = 1;
		Integer value2 = 2;
		VectorHeap<Integer> vector = new VectorHeap<Integer>();
		vector.add(value1);
		vector.add(value2);
		assertEquals(value1, vector.remove());
	}

}
