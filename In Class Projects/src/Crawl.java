import java.io.File;

public class Crawl {
	File myFile = new File("");
	crawl(myFile);
	
	public static void crawl(File myfile) {
		//this is a helper function
		//it reduces the number of parameters needed to call a function
		crawling(myfile, "");
	}
	
	private static void crawling(File myFile, String indent) {
		System.out.println(indent + myFile.getName());
		
		if(myFile.isDirectory()) {
			for(File file : myFile.listFiles()) {
				System.out.println("    " + indent + myFile.getName());
				crawling(file, "    "+indent);
			}
		}
	}
	
}
