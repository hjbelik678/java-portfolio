class Video extends PhysicalItem {
    private int runtime; // in minutes

    public Video(String title, String uniqueId, int runtime) {
        super(title, uniqueId);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }
}