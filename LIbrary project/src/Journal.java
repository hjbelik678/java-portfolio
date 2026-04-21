class Journal extends PhysicalItem {
    public Journal(String title, String uniqueId) {
        super(title, uniqueId);
        //TODO Auto-generated constructor stub
    }

    private String author;
    private String journalName;

    public Journal(String title, String uniqueId, String author, String journalName) {
    	super(title, uniqueId);
        this.author = author;
        this.journalName = journalName;
    }

    public String getAuthor() {
        return author;
    }

    public String getJournalName() {
        return journalName;
    }
}