package nl.tudelft.jpacman.npc.ghost;

import org.junit.jupiter.api.BeforeEach;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;

public class ClydeTest {

    // Création d'un Clyde
    PacManSprites SPRITE_STORE = new PacManSprites();
    GhostFactory factory = new GhostFactory(SPRITE_STORE);
    Ghost clyde = factory.createClyde();


    // variable à tester
    // On peut def la direction vers laquelle regarde Clyde
    // Créer notre level, layout (map), ...
    // En fct de la map, le comportement clyde change

}
