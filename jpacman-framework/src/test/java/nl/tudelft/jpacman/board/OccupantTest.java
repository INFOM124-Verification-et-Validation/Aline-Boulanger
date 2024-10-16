package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;
    private Square target;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }
    // La méthode qui doit être réalisée avant chaque test

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        boolean square_start = unit.hasSquare();
        assertThat(square_start).isEqualTo(false);
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        target = new BasicSquare();
        assertThat(target.isAccessibleTo(unit)).isTrue();
        // On bouge
        unit.occupy(target);
        // Vérifie que le square de unit est bien target
        assertThat(unit.getSquare()).isEqualTo(target);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        target = new BasicSquare();
        // On va une première fois sur le square
        unit.occupy(target);
        // On quitte le square
        unit.leaveSquare();
        // On va une deuxième fois sur le square
        unit.occupy(target);
        // Assertions
        assertThat(unit.getSquare()).isEqualTo(target);


    }
}
