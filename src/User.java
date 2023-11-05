import java.util.LinkedList;
import java.util.ListIterator;

public class User {
	private String name;
    private String email;
    private LinkedList<Tasks> tasks;	
	
	public User(String username, String email) {
		this.name = username;
		this.email = email;
		tasks = new LinkedList<Tasks>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
    public void printTasks(){
    	ListIterator<Tasks> list_Iter = tasks.listIterator(0); 
    	System.out.println(name + "'s Tasks");  
    	System.out.println("Done?\t|\tTask\t|\tDeadline");
    	System.out.println("-----------------------------------------");
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next().toString()); 
        } 
    }
    
    public void addTask(Tasks task) {
    	tasks.add(task);
    }
    
    public void completeTask(int i) {
    	ListIterator<Tasks> list_Iter = tasks.listIterator(i); 
        list_Iter.next().check(); 
    }
	
}
