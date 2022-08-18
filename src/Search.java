import java.util.Scanner;

public class Search {
	public void search() {
		Scanner input = new Scanner(System.in);
		System.out.println("1) First Name ");
		System.out.println("2) Last Name ");
		System.out.println("3) Phone Number ");
		System.out.println("4) Email ");
		System.out.println("\nChoose a search type (1-4) : ");
		int searchType = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter your search: ");
		String search = input.nextLine();
		search: {
			if(searchType == 1) {
				for (Entry entry: List.book) 
					if(entry.getFirstName().contains(search)) {
						System.out.println("\n****************");
						System.out.println(entry);
						System.out.println("****************\n");
						break search;
					} 
			System.out.println("Entry not found!");
			} else if(searchType == 2) {
				for (Entry entry: List.book) 
					if(entry.getLastName().contains(search)) {
						System.out.println("\n****************");
						System.out.println(entry);
						System.out.println("****************\n");
						break search;
					} 
			System.out.println("Entry not found!");
			} else if (searchType == 3) {
				for (Entry entry: List.book) 
					if(entry.getPhoneNumber().contains(search)) {
						System.out.println("\n****************");
						System.out.println(entry);
						System.out.println("****************\n");
						break search;
					} 
			System.out.println("Entry not found!"); 
			} else if (searchType == 4) {
				for (Entry entry: List.book)
					if(entry.getEmail().contains(search)) {
						System.out.println("\n****************");
						System.out.println(entry);
						System.out.println("****************\n");
						break search;
					}
			System.out.println("Entry not found!");
			} else {
				System.out.println("Please enter a number between 1 and 4: ");
				search();
			}
		}
	}
}
