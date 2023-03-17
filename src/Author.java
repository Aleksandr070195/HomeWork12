public class Author {
   private  String theFirstNameAuthor;
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