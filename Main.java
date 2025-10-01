import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int count = 1; // Number of random numbers to generate
        int max = 100;  // Maximum value for the random numbers

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        for (int i = 0; i < count; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}