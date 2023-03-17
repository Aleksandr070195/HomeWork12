
public class Main {

    public static void main(String[] args) {

        String[] author = {"Александр Пушкин", "Федор Достоевский"};
        String[] work = {"Евгений Онегин", "Преступление и наказание"};
        int[] year = {1833, 1866};
        for (int i = 0; i < author.length; i++) {
            for (int j = 0; j < work.length; j++) {
                for (int k = 0; k < year.length; k++) {
                }
            }
            System.out.println("писатель- "+ author[i] + ", произведение- " + work[i] + ", год- " + year[i]);
        }

        Author theFirstNameAuthor = new Author("Александр","Пушкин" );
        Author theSecondNameAuthor = new Author("Федор","Достоевский" );
        System.out.println("theFirstNameAuthor.getTheFirstNameAuthor = " + theFirstNameAuthor.getTheFirstNameAuthor());
        System.out.println("theFirstNameAuthor.getTheSecondNameAuthor = " + theFirstNameAuthor.getTheSecondNameAuthor());
        System.out.println("theSecondNameAuthor.getTheFirstNameAuthor = " + theSecondNameAuthor.getTheFirstNameAuthor());
        System.out.println("theSecondNameAuthor.getTheSecondNameAuthor = " + theSecondNameAuthor.getTheSecondNameAuthor());

        Book theFirstBook = new Book("Евгений Онегин",1833 );
        System.out.println("theFirstBook() = " + theFirstBook.getNameBook());
        System.out.println("theFirstBook() = " + theFirstBook.getPublishingYear());
        theFirstBook.setPublishingYear(2023);
        System.out.println("theFirstBook.getPublishingYear() = " + theFirstBook.getPublishingYear());

        Book theSecondBook = new Book("Преступление и наказание", 1866 );
        System.out.println("theSecondBook() = " + theSecondBook.getNameBook());
        System.out.println("theSecondBook() = " + theSecondBook.getPublishingYear());
    }}