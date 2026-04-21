public class LibraryMain {
    public static void main(String[] args) {
        // Create some library items
        LibraryItem book = new Book("The Great Gatsby", "123456", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("National Geographic", "789012", 2024);
        LibraryItem article = new Journal("Java Basics", "345678", "John Doe", "Journal of Programming");
        LibraryItem video = new Video("Inception", "567890", 148);
        LibraryItem cd = new CD("Greatest Hits", "901234", "Rock");

        displayItemInfo(book);
        displayItemInfo(magazine);
        displayItemInfo(article);
        displayItemInfo(video);
        displayItemInfo(cd);
    }

    // Method to display information about a library item
    public static void displayItemInfo(LibraryItem item) {
        System.out.println("Title: " + item.getTitle());
        System.out.println("Unique ID: " + item.getUniqueId());
        if (item instanceof Book) {
            System.out.println("Author: " + ((Book) item).getAuthor());
        } else if (item instanceof Magazine) {
            System.out.println("Issue Number: " + ((Magazine) item).getIssueNumber());
        } else if (item instanceof Journal) {
            System.out.println("Author: " + ((Journal) item).getAuthor());
            System.out.println("Journal: " + ((Journal) item).getJournalName());
        } else if (item instanceof Video) {
            System.out.println("Runtime: " + ((Video) item).getRuntime() + " minutes");
        } else if (item instanceof CD) {
            System.out.println("Genre: " + ((CD) item).getGenre());
        }
        System.out.println();
    }
}