//Henry Belik

import java.util.ArrayList;

public class interLeaveMain {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i = 10; i <= 30; i += 10) {
            a1.add(i);
        }

        ArrayList<Integer> a2 = new ArrayList<>();
        for (int i = 4; i <= 8; i++) {
            a2.add(i);
        }

        interleave(a1, a2);
     
        ArrayList<Integer> a3 = new ArrayList<>();
        for (int i = 10; i <= 50; i += 10) {
            a3.add(i);
        }

        ArrayList<Integer> a4 = new ArrayList<>();
        for (int i = 6; i <= 8; i++) {
            a4.add(i);
        }

        interleave(a3, a4);
    }

    public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        int size1 = a1.size();
        int size2 = a2.size();
        int maxSize = Math.max(size1, size2);
        
        ArrayList<Integer> both = new ArrayList<>();
        for (int i = 0; i < maxSize; i++) {
            if(i < size1) {
            	both.add(a1.get(i));
            }
            if(i < size2) {
            	both.add(a2.get(i));
            }
        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(both);
    }
}
