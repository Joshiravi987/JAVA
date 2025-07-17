package Exception_handlng;

import java.util.Scanner;

class InvalidAgeException11 extends Exception {
	
	public InvalidAgeException11(String message) {
		super(message);
	}
}

public class User {
	String name ;
	String email ;
	int age ;

User(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name");
	String name = sc.nextLine();
	System.out.println("Enter email");
	String email = sc.nextLine();
	System.out.println("enter age");
	int age = sc.nextInt();

}
	void register() throws InvalidAgeException {
		if (age > 18) {
			System.out.println("Registration successful ");
		}
				else {
					throw new InvalidAgeException("Age is not valid for registration");
					
				}
			}
	

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
		
User u = new User();
u.register();

	}

}
