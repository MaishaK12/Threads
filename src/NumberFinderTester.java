
import java.util.Random;

public class NumberFinderTester {

    public static void main(String[] args) {
        // Create an object of Random class
        Random random = new Random();

        // Call static method of MyUtility class to generate a random number
        int numberToFind = MyUtility.generateRandomNumber(random, 100);

        // Create threads with specified ranges
        NumberFinder ft1 = new NumberFinder(numberToFind, 1, 25);
        NumberFinder ft2 = new NumberFinder(numberToFind, 26, 50);
        NumberFinder ft3 = new NumberFinder(numberToFind, 51, 75);
        NumberFinder ft4 = new NumberFinder(numberToFind, 76, 100);

        // Name threads
        ft1.setName("Thread-1");
        ft2.setName("Thread-2");
        ft3.setName("Thread-3");
        ft4.setName("Thread-4");

        // Start threads
        ft1.start();
        ft2.start();
        ft3.start();
        ft4.start();
    }
}
