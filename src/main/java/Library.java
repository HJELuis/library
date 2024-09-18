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

    public Library() {
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

    protected Book getBook(long isbn){
        Stream<Book> bookStream = this.books.stream();

        Optional<Book> optional = bookStream.
                                    filter(book -> book.getISBN() == isbn)
                                    .findFirst();

        Book book = new Book();

        try {
             book = optional.get();
        } catch(NoSuchElementException e) {
            System.out.print("This book isn't available ");
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

    protected void updateBook(long isbn, String newTitle, String newAuthor, short newYear) {
        Book book = this.getBook(isbn);

        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        book.setYear(newYear);
    }


    protected void updateBook(long isbn, String newTitle, String newAuthor) {
        Book book = this.getBook(isbn);

        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
    }

    protected void updateBook(long isbn, String newTitle) {
        Book book = this.getBook(isbn);

        book.setTitle(newTitle);
    }

    protected void removeBook(long isbn) {
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
            author = optional.get();
        } catch(NoSuchElementException e) {
            System.out.println("This author isn't available ");
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

    /*
    ===== Área de métodos para la colección users ====
    */

    protected void addUser(User user) {
        if(!this.users.contains(user)){
            this.users.add(user);
        } else {
            System.out.println("That user is already registered");
        }
    }

    protected User getUser(String name, String password){
        Stream<User> userStream = this.users.stream();

        Optional<User> optional = userStream.
                filter(user -> user.getName().equals(name))
                .filter(user -> user.getPassword().equals(password))
                .findFirst();

        User user = new User();

        try {
            user = optional.get();
        } catch(NoSuchElementException e) {
            System.out.println("This user isn't registered ");
        }

        return user;
    }


    /**
     * @param name
     * @param email
     * @param password
     * @param borrowedBooks
     *
     * updteUser() método sobrecargado que necesita de un nombre y una contraseña
     */

    protected void updateUser(String name, String email, String password, Set<Book> borrowedBooks) {
        User user = this.getUser(name, password);

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setBorrowedBooks(borrowedBooks);
    }

    protected void updateUser(String name, String email, String password) {
        User user = this.getUser(name, password);

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
    }


    
}
