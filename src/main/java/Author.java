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

    public Author() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBiography() {
        return biography;
    }

    public Set<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setPublishedBooks(Set<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        if(this.name.equals(author.name) && this.lastName.equals(author.lastName)) return true;
        return false;
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
