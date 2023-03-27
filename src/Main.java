
public class Main {

	public static void main(String[] args) throws Exception {
		VectorHeap<Process> vector = new VectorHeap<Process>();
		Reader reader = new Reader();
		reader.Read(vector);
		
		System.out.println("Bienvenido, estos son los procesos del CPU ordenados en base a su prioridad: ");
		
		for (int i =0; i<vector.size(); i++) {
			System.out.println(vector.remove().getPR());
		}

	}

}
