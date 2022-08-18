import java.util.ArrayList;

public class List {
    protected static ArrayList<Entry> book = new ArrayList<>();
    
    
    public static void addList(Entry entry) {
    	book.add(entry);
    }
    
    public static void removeList(Entry entry) {
    	book.remove(entry);
    }

    public static ArrayList<Entry> getList() {
        return book;
    }
    
    public static void clearBook() {
    	book.clear();
    }

		 
}
