package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.level.LevelFactory;
import org.junit.jupiter.api.BeforeEach;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import java.util.*;

// variable à tester est la SHYNESS

public class ClydeTest {

    // Création clyde.
    private GhostFactory clyde;
    // Créer le level.
    private LevelFactory level;
    // Création map
    private List<String> map;
    private GhostMapParser mapGhots;
    // On peut def la direction vers laquelle regarde PACMAN.
    private PacManSprites pacManDirection;
    // Création d'un board.
    private BoardFactory board;


    @Test
    void toutdroit() {
        List<String> map = Arrays.asList("#######", "#P___C#", "#######");



    }
}

// variable à tester
// On peut def la direction vers laquelle regarde Clyde
