
public class Print {
	
	public void print() {
		if (List.getList().isEmpty()) {
			System.out.println("\nNo entries in address book!\n");
		} else {
			for(Entry entry: List.getList()) {
				System.out.println("****************");
				System.out.println(entry);
				System.out.println("****************\n");
			}
		}
	}
}
