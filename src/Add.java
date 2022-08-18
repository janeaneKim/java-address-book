import java.util.Scanner;

public class Add {

	public void add() {
		
		Scanner input = new Scanner(System.in);
		Entry newEntry = new Entry();
		
		System.out.println("Enter a first name: ");
		String firstName = input.nextLine();
		newEntry.setFirstName(firstName);
		
		System.out.println("Enter a last name: ");
		String lastName = input.nextLine();
		newEntry.setLastName(lastName);
		
		System.out.println("Enter a phone number: ");
		String phoneNumber = input.nextLine();
		newEntry.setPhoneNumber(phoneNumber);
		
		System.out.println("Enter an email address: ");
		String email = input.nextLine();
		newEntry.setEmail(email);
		
		List.addList(newEntry);
		System.out.println("Added a new entry!");
		System.out.println("\n****************");
		System.out.println(newEntry);
		System.out.println("****************\n");
	}
	
	

	
};