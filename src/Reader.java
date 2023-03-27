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
	public Vector<String> Read() throws Exception
	{
		Vector<String> v = new Vector<>();
		File file = new File("./src/programas.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String l;
			while((l = br.readLine())!= null) 
			{
				v.add(l);
			}
		} catch (FileNotFoundException e) {
			throw new Ex("Error al leer el archivo");
		}
		return v;
	}	
} 
