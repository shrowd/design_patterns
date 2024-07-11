package memento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix(3, 3);

        while (true) {
            System.out.println("Actual matrix:");
            matrix.print();
            System.out.println("Allowed commands (s <row> <col> <value>, undo, redo, exit):");
            String input = scanner.nextLine();
            if (input.startsWith("s")) {
                String[] parts = input.split(" ");
                if (parts.length == 4) {
                    int row = Integer.parseInt(parts[1]);
                    int col = Integer.parseInt(parts[2]);
                    double value = Double.parseDouble(parts[3]);
                    matrix.set(row, col, value);
                } else {
                    System.out.println("Invalid command.");
                }
            } else if (input.equals("undo")) {
                matrix.undo();
            } else if (input.equals("redo")) {
                matrix.redo();
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
        scanner.close();
    }
}
