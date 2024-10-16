package nl.tudelft.jpacman.npc.ghost;

import org.junit.jupiter.api.BeforeEach;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;

public class ClydeTest {

    PacManSprites SPRITE_STORE = new PacManSprites();
    GhostFactory factory = new GhostFactory(SPRITE_STORE);
    Ghost clyde = factory.createClyde();

    


}
