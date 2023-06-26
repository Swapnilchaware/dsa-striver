package step1.patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int rows = scanner.nextInt();
        for (int row=0;row<rows;row++) {
            for (int col=0;col<rows;col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
