import java.util.Scanner;
import java.util.ArrayList;
public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //3 instances
        Book book1 = new Book("Atomic Habits", 320, 2018);
        Book book2 = new Book("Diary of a Wimpy Kid", 224, 2007);
        Book book3 = new Book("The Vampire Diaries", 272, 1991);



        while (true) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Enter number of pages: ");
            int numOfPages = scanner.nextInt();
            System.out.print("Enter publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();

            // create a new Book object and add it to the ArrayList
            books.add(new Book(title, numOfPages, publicationYear));

        }

        System.out.print("Enter what you want printed (everything or name): ");
        String input = scanner.nextLine();

        if (input.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.getTitle() + ", " + book.getNumOfPages() + " pages, published in " + book.getPublicationYear());
            }
        } else if (input.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid");
        }


    }
}
