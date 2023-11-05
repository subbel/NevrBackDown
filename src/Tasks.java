import java.time.LocalDate;
import java.util.Timer;

public class Tasks {
	
	private String name;
	private String desc;
	private boolean done;
	private LocalDate deadline;
	private Timer time;
	
	
	public Tasks(String name,String desc, LocalDate deadline) {
		this.name = name;
		this.desc = desc;
		this.done = false; //is true when task complete
		this.deadline = deadline;
		
		time = new Timer();
	}
	
	public String toString() {
		return (getDone()+ "\t|\t" + getName() + "\t|\t" + getDeadline());
		
	}
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public boolean getDone() {
		return done;
	}
	
	public LocalDate getDeadline() {
		return deadline;
	}
	
	public void check() {
		done = true;
	}
	
	public String reminder(){
		String message = "Don't forget" + name;
		return message;
	}
	
	
}
