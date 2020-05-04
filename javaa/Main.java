package javaa;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] board = new char[9];
        boolean end = false;

        Arrays.fill(board, ' ');        
        intro();

        while (!end) {
            display(board);
            int input = getInput(board, scan);
            
        }
    }

    public static void intro() {
        System.out.println("\nTic Tac Toe!\nEnter the row then the column to make a move!\nFor example, the top middle space is 12.\n");
    }

    public static void display(char[] b) {
        System.out.printf(" %c | %c | %c\n", b[0], b[1], b[2]);
        System.out.printf("---|---|---\n");
        System.out.printf(" %c | %c | %c\n", b[3], b[4], b[5]);
        System.out.printf("---|---|---\n");
        System.out.printf(" %c | %c | %c\n", b[6], b[7], b[8]);
        System.out.println();
    }

    public static int getInput(char[] b, Scanner scan) {
        int in;
        while (true) {
            System.out.print("Enter a space to move: ");
            in = scan.nextInt();
        }
    }
}