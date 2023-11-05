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
			System.out.println(inputUser + "'s Tasks");
			System.out.println("Options\n (A)dd Tasks \n (C)omplete Tasks \n (Q)uit");
			int n = input.next().charAt(1);
			switch(n) {
				case('a' | 'A'):{
					System.out.println("Name of Task: ");
					String nameT = input.nextLine();
					System.out.println("Description of Task: ");
					String descT = input.nextLine();
					System.out.println("Deadline of Task: "); //deadline as an int rn 
					int deadlineT = input.nextInt();

					Tasks newTask = new Tasks(nameT, descT, deadlineT);
					user.addTask(newTask);
					break;
				}
				case('c' | 'C'):{
					break;
				}	
			}
		}


		user.printTasks();
		
		input.close();

	}

}
