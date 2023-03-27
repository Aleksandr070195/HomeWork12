import java.util.Objects;

public class Author {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return theFirstNameAuthor.equals(author.theFirstNameAuthor) && theSecondNameAuthor.equals(author.theSecondNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theFirstNameAuthor, theSecondNameAuthor);
    }

    private  String theFirstNameAuthor;

    @Override
    public String toString() {
        return
                 theFirstNameAuthor  + " " +
                 theSecondNameAuthor;
                };


    private String theSecondNameAuthor;

    public Author(String theFirstNameAuthor, String theSecondNameAuthor) {
        this.theFirstNameAuthor = theFirstNameAuthor;
        this.theSecondNameAuthor = theSecondNameAuthor;
    }

    public String getTheSecondNameAuthor() {
        return this.theSecondNameAuthor;
    }
    public String getTheFirstNameAuthor() {
        return this.theFirstNameAuthor;
    }
}