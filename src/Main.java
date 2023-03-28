
public class Main {

	public static void main(String[] args) throws Exception {
		VectorHeap<Process> vector = new VectorHeap<Process>();
		Reader reader = new Reader();
		reader.Read(vector);
		int size = vector.size();
		System.out.println("Bienvenido, estos son los procesos del CPU ordenados en base a su prioridad: ");
		
		for (int i =0; i<size; i++) {
			Process process = vector.remove();
			System.out.println(process.getProcessName() +","+process.getUsername()+","+process.getNice() +"," + "PR =" + process.getPR());
		}


	}

}
