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

    // TODO 6 (tema): adauga in lista obstacles doua celule.
    // Alegeti voi pozitiile, cu doua conditii:
    //   - col si row sunt intre 0 si 9;
    //   - nu sunt pe sarpe: (4, 4), (3, 4), (2, 4).
    // Scrieti un constructor GameState() si, in el, adaugati obstacolele, de exemplu:
    //   public GameState() {
    //       obstacles.add(new Cell(..., ...));
    //       obstacles.add(new Cell(..., ...));
    //   }
}
