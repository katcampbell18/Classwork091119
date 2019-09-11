import java.util.ArrayList;
import java.util.Scanner;

public class Movies {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    ArrayList<String> movies = new ArrayList<>();


    while(true){
        System.out.println("Enter a movie title:");
        movies.add(sc.nextLine());
        System.out.println("Enter another key or press 'q' to quit");
        String reply = sc.nextLine();

        if (reply.equalsIgnoreCase("Q")) {
            System.out.println(movies);
            // sort in alphabetical order
            // Collections.sort(movies);
            System.out.println("Goodbye!");
        }

    }
}
}
