package homework9;

public class subSetsMain {
	public static void main(String[] args) {
        String[] names = {"josh", "andrew", "anthony", "jason"};
        generateSubsets(names);
    }
	
	public static void generateSubsets(String[] names) {
        generateSubsetsHelper(names, 0, new StringBuilder());
    }

    private static void generateSubsetsHelper(String[] names, int index, StringBuilder subset) {
        if (index == names.length) {
            System.out.println("{" + subset.toString() + "}");
            return;
        }

        // Include the current name
        subset.append(names[index]).append(" ");
        generateSubsetsHelper(names, index + 1, subset);

        // Exclude the current name
        subset.setLength(subset.length() - names[index].length() - 1);
        generateSubsetsHelper(names, index + 1, subset);
    }
}
