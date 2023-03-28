
public class Main {

	public static void main(String[] args) throws Exception {
		VectorHeap<Process> vector = new VectorHeap<Process>();
		Reader reader = new Reader();
		reader.Read(vector);
		System.out.println(vector.isEmpty());
		System.out.println(vector.getFirst().getUsername());
		System.out.println(vector.size());
		System.out.println(vector.remove().getPR());
		System.out.println(vector.remove().getPR());
		System.out.println(vector.remove().getPR());
		System.out.println(vector.remove().getPR());
		System.out.println("Bienvenido, estos son los procesos del CPU ordenados en base a su prioridad: ");


	}

}
