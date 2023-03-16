
public class Main {

    public static void main(String[] args) {

        String[] author = {"А.С.Пушкин", "Ф.М.Достоевский"};
        String[] work = {"Евгений Онегин", "Преступление и наказание"};
        int[] year = {1833, 1866};
        for (int i = 0; i < author.length; i++) {
            for (int j = 0; j < work.length; j++) {
                for (int k = 0; k < year.length; k++) {
                }
            }
            System.out.println("писатель- "+ author[i] + ", произведение- " + work[i] + ", год- " + year[i]);
        }

        Book Pushkin = new Book("А.С.Пушкин", "Евгений Онегин", 1833 );
        System.out.println("Pushkin.Author() = " + Pushkin.getAuthor());
        System.out.println("Pushkin.Work() = " + Pushkin.getWork());
        System.out.println("Pushkin.Year() = " + Pushkin.getYear());
        Pushkin.setYear(2023);
        System.out.println("Pushkin.getYear() = " + Pushkin.getYear());
        Book Dostoevsky = new Book("Ф.М.Достоевский","Преступление и наказание", 1866 );
        System.out.println("Dostoevsky.Author() = " + Dostoevsky.getAuthor());
        System.out.println("Dostoevsky.Work() = " + Dostoevsky.getWork());
        System.out.println("Dostoevsky.Year() = " + Dostoevsky.getYear());
    }}