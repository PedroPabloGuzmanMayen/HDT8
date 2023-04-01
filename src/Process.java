/**
 * 
 * @author Guztavo Cruz, Pedro Pablo Guzmán
 * @version 1.0.0
 *
 */
public class Process implements Comparable<Process> {
	private String username;
	private String processName;
	private int Nice;
	private int PR;
	PRCalculator calculator = new PRCalculator();
	/**
	 * Método constructor que sirve para iniciar cualquier instancia de clase 
	 * @param username el nombre del usuario que utliza el proceso
	 * @param processname el nombre del proceso 
	 * @param Nice el valor NICE del proceso 
	 */
	public Process(String username, String processname, int Nice) {
		this.username = username;
		this.processName = processname;
		this.Nice = Nice;
		this.PR = calculator.calculatePR(Nice);
		
	}
	
	/**
	 * Obtiene el nombre de usuario de quien utiliza el proceso
	 * @return el nombre de usuario de quien usa el proceso
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Modifica el nombre de quien usa el proceso
	 * @param username el nuevo nombre de usuario del proceso
	 */
	public void setUsername(String username) {
		this.username = username;
	}

/**
 * Obtiene el nombre del proceso
 * @return el nombre del proceso
 */
	public String getProcessName() {
		return processName;
	}

/**
 * Modifica el nombre del proceso
 * @param processName el nombre del proceso modificado
 */
	public void setProcessName(String processName) {
		this.processName = processName;
	}

/**
 * Obtiene el valor NICE del proceso
 * @return el valor NICE del proceso
 */
	public int getNice() {
		return Nice;
	}

/**
 * Modifica el valor nice de un proceso
 * @param nice el nuevo valor nice del proceso
 */
	public void setNice(int nice) {
		Nice = nice;
	}
/**
 * Obtiene el valor PR del proceso
 * @return el valor PR del proceso
 */
	public int getPR() {
		return PR;
	}

/**
 * Modifica el valor PR de un proceso
 * @param pR el nuevo valor PR del proceso
 */
	public void setPR(int pR) {
		PR = pR;
	}

/**
 *  Indica la forma en la que los objetos process deben ser comprados
 *  @param o el objeto con el que se debe comparar
 */
	@Override
	public int compareTo(Process o) {
		// TODO Auto-generated method stub
		return this.getNice() - o.getNice();
	}
	
}
