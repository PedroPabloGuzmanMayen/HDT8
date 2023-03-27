
public class Process implements Comparable<Process> {
	private String username;
	private String processName;
	private int Nice;
	private int PR;
	PRCalculator calculator = new PRCalculator();
	
	public Process(String username, String processname, int Nice) {
		this.username = username;
		this.processName = processname;
		this.Nice = Nice;
		this.PR = calculator.calculatePR(Nice);
		
	}
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getProcessName() {
		return processName;
	}


	public void setProcessName(String processName) {
		this.processName = processName;
	}


	public int getNice() {
		return Nice;
	}


	public void setNice(int nice) {
		Nice = nice;
	}


	public int getPR() {
		return PR;
	}


	public void setPR(int pR) {
		PR = pR;
	}


	@Override
	public int compareTo(Process o) {
		// TODO Auto-generated method stub
		return this.getNice() - o.getNice();
	}
	
}
