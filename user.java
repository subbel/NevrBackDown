public class User {
    private String name;
    private String email;
    private String[] tasks;	
	
	public User(String username, String email) {
		this.name = username;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
    public String getTasks(){
    	return "task";
    }
	
}