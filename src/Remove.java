import java.util.Scanner;

public class Remove {
	
	public void remove() {
		Scanner input = new Scanner(System.in);

		
		System.out.println("Enter the email of the entry to remove: ");
		String remove = input.nextLine();
	
		search: {
			for(Entry entry : List.getList()) 
				if(entry.getEmail().equals(remove)) {
					List.removeList(entry);
					System.out.println("Deleted the following entry: ");
					System.out.println("\n****************");
					System.out.println(entry);
					System.out.println("****************\n");
					break search;	
				}
			System.out.println("\nEntry not found!\n");
		}
				
	}
	
	public void clearBook() {
		List.clearBook();
		System.out.println("\nAddress book cleared!\n");	
	}
	
	

}
