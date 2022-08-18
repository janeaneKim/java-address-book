import java.util.InputMismatchException;
import java.util.Scanner;

public class StartScript {
	
	Scanner input = new Scanner(System.in);
	public int action;
	
	public void start() {
		try {
			System.out.println("1) Add an entry");
			System.out.println("2) Remove an entry");
			System.out.println("3) Search for an entry");
			System.out.println("4) Print address book");
			System.out.println("5) Delete book");
			System.out.println("6) Quit");
			System.out.println(" ");

			System.out.println("Please choose what you'd like to do: ");
			action = input.nextInt();
		}catch(InputMismatchException e) {
			System.out.print("Address book only takes in numbers. Please try agian.");
		}

	}
	
	public void reader() {
		try {
			Add addEntry = new Add();
			Remove removeEntry = new Remove();
			Search searchEntry = new Search();
			Print printBook = new Print();
			
				if(action == 1) {
					//add
					addEntry.add();
					start();
					reader();
				}else if (action == 2) {
					//remove
					removeEntry.remove();
					start();
					reader();
				} else if (action == 3) {
					//search
					searchEntry.search();
					start();
					reader();
				} else if(action == 4) {
					//print
					printBook.print();
					start();
					reader();
				} else if (action == 5) {
					//delete
					removeEntry.clearBook();
					start();
					reader();
				}else if( action ==6) {
					System.out.println("Quitting the Address Book- Thank you");
				} else if (action <=0 || action >=7){
					System.out.println("Please enter a valid number between 1-6");
					action = input.nextInt();
					reader();
				} else {
					System.out.println("Address Book only takes numbers. Please run again");
				}
		} catch(InputMismatchException e) {
		}
			
	}
}

