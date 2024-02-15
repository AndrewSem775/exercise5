import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> stuffICantLearn = new HashMap<String, String >();
        Book book1 = new Book(stuffICantLearn);

        Person person1 = new Person("DudeK", "DudeKilloranRocks79@gmail.com");
        Person person2 = new Person("bobb stone", "ILikeCheese123@gmail.com");

        book1.addContact(person1);
        book1.addContact(person2);

        System.out.println(book1);
    }
}