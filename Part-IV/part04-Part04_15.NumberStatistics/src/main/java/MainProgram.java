
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        Statistics statistics = new Statistics();
        Statistics statisticstwo = new Statistics();
        Statistics statisticsthree = new Statistics();
        
        while (true) {
            System.out.println("Enter numbers:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0) {
                statisticstwo.addNumber(number);
            } else if (number % 2 != 0) {
                statisticsthree.addNumber(number);
            }

            statistics.addNumber(number);
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticstwo.sum());
        System.out.println("Sum of odd numbers: " + statisticsthree.sum());
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}