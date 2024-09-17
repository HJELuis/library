import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Library {
    private Set<Book> books;
    private Set<Author> authors;
    private Set<User> users;

    public Library(Set<Book> books, Set<Author> authors, Set<User> users) {
        this.books = books;
        this.authors = authors;
        this.users = users;
    }

    /*
    ===== Área de métodos para la colección books =====
    */

    protected void addBook(Book book) {
        if(!this.books.contains(book)){
            this.books.add(book);
        } else {
            System.out.println("That book is already in the library");
        }
    }

    protected Book getBook(int isbn){
        Stream<Book> bookStream = this.books.stream();

        Optional<Book> optional = bookStream.
                                    filter(book -> book.getISBN() == isbn)
                                    .findFirst();

        Book book = new Book();

        try {
            if(optional.isPresent()) book = optional.get();
        } catch(NoSuchElementException e) {
            System.out.println(e + "This book isn't available");
        }

        return book;
    }

    /**
     *
     * @param isbn
     * @param newTitle
     * @param newAuthor
     * @param newYear
     *
     * updteBook() método sobrecargado que necesita de un isbn
     */

    protected void updateBook(int isbn, String newTitle, Author newAuthor, short newYear) {
        Book book = this.getBook(isbn);

        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        book.setYear(newYear);
    }


    protected void updateBook(int isbn, String newTitle, Author newAuthor) {
        Book book = this.getBook(isbn);

        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
    }

    protected void updateBook(int isbn, String newTitle) {
        Book book = this.getBook(isbn);

        book.setTitle(newTitle);
    }

    protected void removeBook(int isbn) {
        this.books.remove(this.getBook(isbn));
    }

    /*
    ===== Área de métodos para la colección authors ====
    */

    protected void addAuthor(Author author) {
        if(!this.authors.contains(author)){
            this.authors.add(author);
        } else {
            System.out.println("That author is already in the library");
        }
    }

    protected Author getAuthor(String name, String lastName){
        Stream<Author> authorStream = this.authors.stream();

        Optional<Author> optional = authorStream.
                filter(author -> author.getName().equals(name))
                .filter(author -> author.getLastName().equals(lastName))
                .findFirst();

        Author author = new Author();

        try {
            if(optional.isPresent()) author = optional.get();
        } catch(NoSuchElementException e) {
            System.out.println(e + "This author isn't available");
        }

        return author;
    }

    /**
     * @param name
     * @param lastName
     * @param biography
     * @param publishedBooks
     *
     * updteAuthor() método sobrecargado que necesita de un nombre y un apellido
     */
    protected void updateAuthor(String name, String lastName, String biography, Set<Book> publishedBooks) {
        Author author = this.getAuthor(name, lastName);

        author.setName(name);
        author.setLastName(lastName);
        author.setBiography(biography);
        author.setPublishedBooks(publishedBooks);

    }

    protected void updateAuthor(String name, String lastName, String biography) {
        Author author = this.getAuthor(name, lastName);

        author.setName(name);
        author.setLastName(lastName);
        author.setBiography(biography);

    }

    protected void updateAuthor(String name, String lastName) {
        Author author = this.getAuthor(name, lastName);

        author.setName(name);
        author.setLastName(lastName);

    }

    protected void removeAuthor(String name, String lastName) {
        this.authors.remove(this.getAuthor(name,lastName));
    }
    
}
