package memento;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Memento> stateHistory;
    private int currentStateIndex = -1;

    public Storage() {
        this.stateHistory = new ArrayList<>();
    }

    public void save(Matrix.MatrixMemento mm) {
        stateHistory.add(mm);
        currentStateIndex = stateHistory.size() - 1;
    }

    public Matrix.MatrixMemento read(String string) {
        switch (string) {
            case "undo" -> {
                if (currentStateIndex >= 0 && currentStateIndex < stateHistory.size()) {
                    Matrix.MatrixMemento mm = (Matrix.MatrixMemento) stateHistory.get(currentStateIndex);
                    currentStateIndex--;
                    return mm;
                } else {
                    System.out.println("No operations to undo.");
                    return null;
                }
            }
            case "redo" -> {
                if (currentStateIndex < stateHistory.size() - 1) {
                    currentStateIndex++;
                    return (Matrix.MatrixMemento) stateHistory.get(currentStateIndex);
                } else {
                    System.out.println("No operations to redo.");
                    return null;
                }
            }
            default -> {
                System.out.println("Invalid operation.");
                return null;
            }
        }
    }
}
