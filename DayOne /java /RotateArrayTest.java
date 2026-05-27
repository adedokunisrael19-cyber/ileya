import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    @Test
    public void testRotateByTwo() {

        int[] arr = {1, -9, 3, 0, 8};

        int[] expected = {0, 8, 1, -9, 3};

        int[] actual = RotateArray.rotate(arr, 2);

        assertArrayEquals(expected, actual);
    }

