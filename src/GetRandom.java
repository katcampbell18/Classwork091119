import java.util.ArrayList;
import java.util.Random;

public class GetRandom {

    private Random rnd = new Random();

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Add elements to the arraylist
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        // create constructor for Random class
        // iterate through objects from list generated in getRandomItem method
        GetRandom obj = new GetRandom();
        for (int i = 0; i < 5; i++) {
            System.out.println(obj.getRandomItem(list));
        }
    }

    // method to print elements of Arraylist randomly
    public String getRandomItem(ArrayList<String> list) {
        int index = rnd.nextInt(list.size());
        System.out.println("\nIndex: " + index);
        return list.get(index);
    }
}

