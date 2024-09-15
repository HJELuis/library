public class Book {
    private String title;
    //private Author author;
    private short year;
    private int ISBN;

    public Book(String title, short year, int ISBN) {
        this.title = title;
        this.year = year;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public short getYear() {
        return year;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", ISBN=" + ISBN +
                '}';
    }
}
