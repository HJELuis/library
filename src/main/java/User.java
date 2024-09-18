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

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBorrowedBooks(Set<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return this.password.equals(user.password);
    }

}
