import java.io.*;
import java.util.*;

/**
 * 
 */

/**
 * @author gustavo
 *
 */
public class Reader {
	public void Read(VectorHeap<Process> v) throws Exception
	{

		File file = new File("./src/programas.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String string;
			while((string = br.readLine())!= null) 
			{
				String[] parts = string.split(",");
				Process process = new Process(parts[0], parts[1], Integer.parseInt(parts[2]));
				v.add(process);
			}
		} catch (FileNotFoundException e) {
			throw new Ex("Error al leer el archivo");
		}

	}	
} 
