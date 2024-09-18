import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contexto {
    public static void main(String[] args) {


        //Creando una colección de libros
        Book firstBook = new Book("El Quijote", "Miguel de Cervantes", (short)1615, 2260403037398L);
        Set<Book> books = new HashSet<>();
        books.add(firstBook);

        //Creando una colección de autores
        Author firstAuthor = new Author("Miguel de Cervantes", "Saavedra","(Alcalá de Henares,4 29 de septiembre de 1547-Madrid, 22 de abril 3 de 1616) fue un novelista, poeta, dramaturgo y soldado español."
                ,books);
        Set<Author> authors = new HashSet<>();
        authors.add(firstAuthor);

        //Creando una colección de usuarios
        User firstUser = new User("Luis", "luisenrique@gmail","lui34@-en",books);
        Set<User> users = new HashSet<>();
        users.add(firstUser);

        //Creando un objeto librería apartir de las colecciones creadas
        Library library = new Library(books,authors,users);
        library.addBook(new Book("Cien años de soledad"," Gabriel García Márquez",(short)1967,234761234561L));
        System.out.println(library.getBook(234761234561L));
        System.out.println(library.getBook(7898976780123L));
        library.updateBook(2260403037398L, "Nuevo Título","Nuevo Autor", (short)2024);
        System.out.println(library.getBook(2260403037398L));
        library.removeBook(2260403037398L);
        System.out.println(library.getBook(2260403037398L));



    }
}
