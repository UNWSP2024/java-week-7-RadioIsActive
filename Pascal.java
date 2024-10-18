package src.JavaWeek7Programs;

public class Pascal {
    public static void main(String[] args) {
        int[][] pascal = new int[11][11];
        for (int row = 0; row < 11; row++) {
            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    pascal[row][col] = 1;
                } else {
                    pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col];
                }
            }
        }
        for (int row = 0; row < 11; row++) {
            for (int space = 0; space < 11 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print(pascal[row][col] + "   ");
            }
            System.out.println();
        }
    }
}
