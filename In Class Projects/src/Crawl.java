import java.io.File;

public class Crawl {

    public static void main(String[] args) {
        // You must specify a valid path. "." means the current project folder.
        File myFile = new File("."); 
        crawl(myFile);
    }

    public static void crawl(File file) {
        crawling(file, "");
    }

    private static void crawling(File myFile, String indent) {
        // Print the file/directory name with the current indentation
        System.out.println(indent + myFile.getName());

        // If it's a directory, list the files and recurse
        if (myFile.isDirectory()) {
            File[] files = myFile.listFiles();
            
            // Good practice: check if files is null (happens with restricted folders)
            if (files != null) {
                for (File file : files) {
                    // Pass a deeper indent to the next level
                    crawling(file, indent + "    "); 
                }
            }
        }
    }
}