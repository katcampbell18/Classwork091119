import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindValue {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        Random rand = new Random();
        int randInt;

        for (int i = 0; i < 25; i++) {
            randInt = 1 + rand.nextInt(50);
            number.add(randInt);
        }
            System.out.println("ArrayList: " + number);

        System.out.println("Value to find:");
        int input = sc.nextInt();
        if(number.contains(input)){
            System.out.println(input + " is in the ArrayList.");
        }else{
            System.out.println("The number is not present.");
        }
    }
}
