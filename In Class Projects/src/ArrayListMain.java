import java.util.ArrayList;

// check slides for errors
public class ArrayListMain {
	Scanner MyScanner = new Scanner(new File("file"));
	ArrayList <Double> list = new ArrayList<>();
	double sum = 0.0;
	
	double firstNum = MyScanner.nextDouble();
	double high = 0.0;
	double low = 0.0;
	
	
	while (MyScanner.hasNext()) {
	    double num = MyScanner.nextDouble();
	    list.add(num);
	    sum+=num;
	    if(num>high)
	    	high = num;
	    if(num<low)
	    	low = num;
	}
	System.out.println(list);
	System.out.println("High: " + high + "Low: " + low);
	System.out.println("Average: " +sum/list.size());
	
	//ArrayList <String> list1 = new ArrayList<the, quick, brown, fox>();
	
	
	ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
	ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
	
	System.out.println(list1);
	System.out.println(list2);
	System.out.println(intersect(list1, list2));
	
	public static ArrayList <Integer> intersect(ArrayList <Integer>list1, ArrayList <Integer>list2) {
		ArrayList <Integer> list3 = new ArrayList<Integer>();
		for(int i=0; i<list1.size(); i++) {
			if(list2.contains(list1.get(i)) {
				list3.add(list1.get(i));
			}
		}
	}

	public static void removeEven(ArrayList<Double> list) {
		for (int i = 0; i < list.size(); i++) {
	        if (list.get(i) % 2 == 0) {
	            list.remove(i);
	            i--;
	        }
	    }
	
	}
	
	public static void addStars(ArrayList<String> list) {
	    for (int i = 0; i < list.size(); i += 2) {
	        list.add(i, "*");
	    }
	}
	
	public static void removeStars(ArrayList<String> list) {
		for(int i=1; i<list.size(); i++) {
			list.remove(i);
		}
	}
	
	public static void removeEvenBackwards(ArrayList<Double> list) {
		for (int i = list.size()-1; i >= 0; i--) {
	        if (list.get(i) % 2 == 0) {
	            list.remove(i);
	        }
	    }
	

	public static int 

}
