import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Creates list
        ArrayList<Integer> s = new ArrayList<Integer>();

        //Adds random numbers
        for (int i = 0; i < 11; i++) {
            s.add((int) Math.floor(Math.random() * 11));
        }
        System.out.println("Original List: " + s);

        System.out.println("\nDuplicates and their counts:");
        for (int i = 0; i < s.size(); i++) {
            int currentItem = s.get(i);
            int count = 0;
            for (int j = 0; j < s.size(); j++) {
                if (s.get(j).equals(currentItem)) {
                    count++;
                }
            }
            if (count > 1) {
                // Avoid printing duplicates more than once
                if (!s.subList(0, i).contains(currentItem)) {
                    System.out.println("\nDuplicate: " + currentItem + ", Count: " + count);
                }else{

                }

            }
        }
    }
}