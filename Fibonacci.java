package src.JavaWeek7Programs;

import java.util.Scanner;

public class Fibonacci {

    static Scanner userinput = new Scanner(System.in); 

    public static void main(String[] args) {

        int n;
        
        System.out.print("How many digits of the fibonacci sequence would you like to print? (Pick a number between 1 and 32) ");
        n = userinput.nextInt();

        //Wrong method: int[] list = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309};

        if (n >= 1 && n <= 32) {
            int[] fibonacciSequence = new int[n];

            if (n >= 1) {
                fibonacciSequence[0] = 1;
            }
            if (n >= 2) {
                fibonacciSequence[1] = 1;
            }
            for (int i = 2; i < n; i++) {
                fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2]; 
            }
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacciSequence[i] + " \n");
            }
        } else {
            System.out.println("Please pick a number between 1 and 32.");
        }
    userinput.close();
}
}
