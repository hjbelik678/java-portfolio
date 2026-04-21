class Book extends PhysicalItem {
    private String author;

    public Book(String title, String uniqueId, String author) {
        super(title, uniqueId);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}