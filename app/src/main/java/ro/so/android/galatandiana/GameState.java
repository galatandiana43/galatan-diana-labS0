package ro.so.android.galatandiana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameState {

    public final List<Cell> snake = new ArrayList<>(Arrays.asList(
            new Cell(4, 4),
            new Cell(3, 4),
            new Cell(2, 4)
    ));

    public final List<Cell> obstacles = new ArrayList<>();

    public GameState() {
        obstacles.add(new Cell(7, 2));
        obstacles.add(new Cell(1, 8));
    }
}
