import java.util.Random;
import java.util.Scanner;

/*
Part 1:
Write a program that creates an array with five intergers.
Then populate it with numbers ranging from 1 to 100.
Print the length of the array,
then use a for-loop (either regular or enhanced) to print each item in the array.

Part 2:
Modify the program to populate it with user input, using a loop.

Bonus:
Use a random number generator
*/

public class Quiz {
    public static void main(String[] args) {
        // part 1
        int[] arr = new int[5];
        arr[0] = 15;
        arr[1] = 3;
        arr[2] = 99;
        arr[3] = 45;
        arr[4] = 67;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("There are " + arr.length + " numbers.");
            System.out.println("The numbers are " + arr[i]);
        }
        // part 2
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[5];

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Please enter some numbers:");
            arr2[i] = sc.nextInt();
            System.out.println("There are " + arr2.length + " numbers.");
            System.out.println("The numbers are: " + arr2[i]);
        }
        // Bonus
        Random rand = new Random();
        int randInt;

        int [] arr3 = new int [5];
        for (int i = 0; i < arr3.length; i++){
            randInt = 1 + rand.nextInt(100);
            arr3[i] = randInt;
        }
        for(int i= 0; i < arr3.length; i++){
            System.out.println("There are " + arr3.length + " numbers.");
            System.out.println("The numbers are: " + arr3[i]);
        }
    }
}