import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumTest {
    
    @Test
    public void testTwoSum() {

        int[] nums = {2, 7, 11, 15};

        int[] expected = {0, 1};

        int[] actual = TwoSum.getSum(nums, 9);

        assertArrayEquals(expected, actual);
    }
}
