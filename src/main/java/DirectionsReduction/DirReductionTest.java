package DirectionsReduction;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class DirReductionTest {
    @Test
    public void testSimpleDirReduc() {
        assertArrayEquals("message",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
                new String[]{},
                DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
    }
}