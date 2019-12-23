import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendulumTest {


    int[] example1 = new int[]{19,30,16,19,28,26,28,17,21,17};
    int[] example1Solution = new int[]{28,26,19,17,16,17,19,21,28,30};
    int[] example2 = new int[]{48,41,38,35,50,46,38,42,37,49,44,32,37};
    int[] example2Solution = new int[]{50,48,44,41,38,37,32,35,37,38,42,46,49};
    int[] example3 = new int[]{-36,-38,-44,-47,-41,-27,-10,-30,-22,-11,-23,-50,-23};
    int[] example3Solution = new int[]{-10,-22,-23,-30,-38,-44,-50,-47,-41,-36,-27,-23,-11};


    @Test
    @DisplayName("Should return an array")
    void pendulum() {

        Pendulum pendulum = new Pendulum();
        assertArrayEquals(example1Solution,pendulum.pendulum(example1));
        assertArrayEquals(example2Solution,pendulum.pendulum(example2));
        assertArrayEquals(example3Solution,pendulum.pendulum(example3));
    }
}