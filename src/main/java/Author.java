import java.util.Set;

public class Author {
    private String name;
    private String lastName;
    private String biography;
    private Set<Book> publishedBooks;

    public Author(String name, String lastName, String biography, Set<Book> publishedBooks) {
        this.name = name;
        this.lastName = lastName;
        this.biography = biography;
        this.publishedBooks = publishedBooks;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", biography='" + biography + '\'' +
                ", publishedBooks=" + publishedBooks +
                '}';
    }
}
