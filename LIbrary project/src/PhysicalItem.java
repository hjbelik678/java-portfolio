abstract class PhysicalItem implements LibraryItem {
    private String title;
    private String uniqueId;

    public PhysicalItem(String title, String uniqueId) {
        this.title = title;
        this.uniqueId = uniqueId;
    }

    public String getTitle() {
        return title;
    }

    public String getUniqueId() {
        return uniqueId;
    }
}