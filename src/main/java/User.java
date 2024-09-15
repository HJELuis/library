import java.util.Set;

public class User {
    private String name;
    private String email;
    private String password;
    private Set<Book> borrowedBooks;

    public User(String name, String email, String password, Set<Book> borrowedBooks) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.borrowedBooks = borrowedBooks;
    }
}
