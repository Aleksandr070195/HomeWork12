import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && nameBook.equals(book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, publishingYear);
    }

    private final String nameBook;
    private  final Author nameAuthor;
    private int publishingYear;
    public Book(String nameBook, Author nameAuthor, int publishingYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }
    public int getPublishingYear() {
        return this.publishingYear;}


public void setPublishingYear(int publishingYear) {
    this.publishingYear = publishingYear;
}}

