import java.io.*;
import java.util.*;


/**
 * 
 */

/**
 * @author Gustavo Cruz, Pedro Pablo Guzmán
 *
 */
public class Reader {
	/**
	 * This method reads the data from a txt 
	 * @param v
	 * @throws Exception
	 */
	public void Read(IPriorityQueue<Process> pq) throws Exception
	{

		File file = new File("Procesos.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String string;
			while((string = br.readLine())!= null) 
			{
				String[] parts = string.split(",");
				Process process = new Process(parts[0], parts[1], Integer.parseInt(parts[2]));
				pq.add(process);
			}
			pq.getFirst();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Error al leer el archivo");
		}

	}	
} 
