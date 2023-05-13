public class Book {

    private String title;
    private int numOfPages;
    private int publicationYear;

    public Book(String title, int numOfPages, int publicationYear) {
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }


    @Override
    public String toString() {
        return title + " has " + numOfPages + " pages, and was published in " + publicationYear;
    }
}
