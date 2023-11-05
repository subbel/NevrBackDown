import java.time.LocalDate;
import java.util.Scanner;


public class Main {

	public static Scanner input;
	public static User user;
	public static boolean running = true;
		
	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.print("\nName: ");
		String inputUser = input.nextLine();
		
		System.out.print("\nEmail: ");
		String inputEmail = input.nextLine();
		
		user = new User(inputUser, inputEmail); 
		
		while(running) {
			user.printTasks();
	    	System.out.println("-----------------------------------------");
			System.out.println("Options\n (A)dd Tasks \n (C)omplete Tasks \n (Q)uit");
			int n = input.next().charAt(0);
			switch(n) {
				case('a' | 'A'):{
					System.out.println("Name of Task: ");
					String nameT = input.next();
					
					System.out.println("Description of Task: ");
					String descT = input.next();
					
					System.out.println("Deadline of Task (yyyy-MM-dd): "); //deadline as an int rn 
					LocalDate deadlineT = LocalDate.parse(input.next());
					System.out.println(deadlineT);

					Tasks newTask = new Tasks(nameT, descT, deadlineT);
					user.addTask(newTask);
					break;
				}
				case('c' | 'C'):{
					boolean compTry = true;
					while(compTry) {
						try {
							System.out.println("Which task?");
							int checkT = input.nextInt() - 1;
							user.completeTask(checkT);
							compTry = false;
						}catch(Exception e) {
							System.out.println("Try again");
						}
					}
					break;
				}	
				case('q' | 'Q'):{
					running = false;
					break;
				}
				default:
					System.out.println("Try again");
			}
		}

		System.out.println("goodbye");
		input.close();

	}

}
