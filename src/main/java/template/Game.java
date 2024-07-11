package template;

public abstract class Game {

    public final void run() {
        initialize();
        while (!gameOver()) {
            makeMoves();
            paintScreen();
        }
        onEnd();
    }

    public abstract void onEnd();

    public abstract void paintScreen();

    public abstract void makeMoves();

    public abstract void initialize();

    public boolean gameOver() {
        return false;
    }
}
