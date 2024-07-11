package memento;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Matrix {

    private double[][] matrix;
    private Storage storage;

    public Matrix(int rows, int cols) {
        this.matrix = new double[rows][cols];
        initialize();
        this.storage = new Storage();
    }

    public class MatrixMemento implements Memento {
        int row;
        int col;
        double val_from, val_to;
    }

    public Memento set(int row, int col, double value) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length) {
            MatrixMemento mem = new MatrixMemento();
            mem.row = row;
            mem.col = col;
            mem.val_from = matrix[row][col];
            mem.val_to = value;
            matrix[row][col] = value;
            storage.save(mem);
            return mem;
        } else {
            System.out.println("Invalid matrix coordinates provided.");
            return null;
        }
    }

    public void undo() {
        MatrixMemento mem = storage.read("undo");
        if (mem != null) {
            matrix[mem.row][mem.col] = mem.val_from;
        }
    }

    public void redo() {
        MatrixMemento mem = (MatrixMemento) storage.read("redo");
        if (mem != null) {
            matrix[mem.row][mem.col] = mem.val_to;
        }
    }

    private void initialize() {
        final int[] value = {1};
        IntStream.range(0, matrix.length)
                .forEach(i -> IntStream.range(0, matrix[0].length)
                        .forEach(j -> {
                            matrix[i][j] = value[0];
                            value[0]++;
                        }));
    }

    public void print() {
        for (double[] value : matrix) {
            System.out.println(Arrays.toString(value));
        }
    }
}
