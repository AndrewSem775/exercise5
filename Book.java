import java.util.HashMap;

public class Book {

    private HashMap<String, String> addressBook;

    public Book(HashMap<String, String> addressBook) {
        this.addressBook = addressBook;
    }

    public void addContact(Person a){
        addressBook.put(a.getName(), a.getEmail());
    }


    @Override
    public String toString() {
        return "Book{" +
                "addressBook=" + addressBook +
                '}';
    }
}