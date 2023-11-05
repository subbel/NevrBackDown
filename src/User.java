import java.util.LinkedList;

public class User {
	private String name;
    private String email;
    private LinkedList<Object> tasks;	
	
	public User(String username, String email) {
		this.name = username;
		this.email = email;
		tasks = new LinkedList<Object>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
    public void printTasks(){
    	System.out.println(tasks);
    }
    
    public void addTask(Tasks task) {
    	tasks.add(task);
    }
	
}
