package src.JavaWeek7Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModApp {

    static Scanner userinput = new Scanner(System.in); 
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int count = 0;

        System.out.println("Please enter up to 20 integers (enter a non-integer to stop):");

        while (count < 20) {
            if (userinput.hasNextInt()) {
                numbers[count] = userinput.nextInt();
                count++;
            } else {
                break;
            }
        }

        boolean editing = true;
        while (editing) {
            System.out.println("Current numbers: " + Arrays.toString(Arrays.copyOf(numbers, count)));
            System.out.print("Do you want to edit a number? (yes/no): ");
            String response = userinput.next();

            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Enter the index (0 to " + (count - 1) + ") of the number to edit: ");
                int index = userinput.nextInt();

                if (index >= 0 && index < count) {
                    System.out.print("Enter the new value: ");
                    numbers[index] = userinput.nextInt();
                } else {
                    System.out.println("Invalid index. Please try again.");
                }
            } else {
                editing = false;
            }
        }
        Arrays.sort(numbers, 0, count);

        System.out.println("Sorted numbers: " + Arrays.toString(Arrays.copyOf(numbers, count)));

        userinput.close();
    }
}
