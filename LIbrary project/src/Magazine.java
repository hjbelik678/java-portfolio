class Magazine extends PhysicalItem {
    private int issueNumber;

    public Magazine(String title, String uniqueId, int issueNumber) {
        super(title, uniqueId);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}