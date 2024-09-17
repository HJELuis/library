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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.email.equals(user.email);
    }

}
