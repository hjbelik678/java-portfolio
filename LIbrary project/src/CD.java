class CD extends PhysicalItem {
    private String genre;

    public CD(String title, String uniqueId, String genre) {
        super(title, uniqueId);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}