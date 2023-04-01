
import java.util.*;
/**
 * 
 * @author Guztavo Cruz, Pedro Pablo Guzmán
 * @version 1.0.0
 *
 */
public class Main {

	/**
	 * Es el método en donde se ejecuta el programa
	 * @param args
	 * @throws Exception Ilegal Argument Expecption si se ingresa un valor inválido
	 */
	public static void main(String[] args) throws Exception {
		PriorityQueueFactory factory = new PriorityQueueFactory();
		Reader reader = new Reader();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out
					.println("\n\n\t\tSeleccione la implementacion que desea usar: \n\t1. VectorHeap\n\t2. PriorityQueue\n\t3. Terminar el programa");
			String option = sc.nextLine();
			if (option.equals("1")) {
				IPriorityQueue<Process> vector = factory.createPQ(PriorityQueueFactory.PQueue.VectorHeap);
				reader.Read(vector);
				int size = vector.size();
				System.out.println("Bienvenido, estos son los procesos del CPU ordenados en base a su prioridad: ");
				for (int i = 0; i < size; i++) {
					Process process = vector.remove();
					System.out.println(process.getProcessName() + "," + process.getUsername() + "," + process.getNice()
							+ "," + "PR =" + process.getPR());
				}
			} 
			else if (option.equals("2")) 
			{
				IPriorityQueue<Process> PQ = factory.createPQ(PriorityQueueFactory.PQueue.PQueue);
				reader.Read(PQ);
				int size = PQ.size();
				for (int i = 0; i < size; i++) {
					Process process = PQ.remove();
					System.out.println(process.getProcessName() + "," + process.getUsername() + "," + process.getNice()
							+ "," + "PR =" + process.getPR());
				}
			} 
			else if (option.equals("3")) 
			{
				b=false;
			} 
			else 
			{
				System.out.println("\n\t*** Opcion no valida, intente nuevamente ***\n\n");
			} 
		}
	}
}
