import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RunLengthEncodingTest{

    @Test
    public void testEncodingOne() {

        String expected = "a3b2c";

        String actual = RunLengthEncoding.encode("aaabbc");

        assertEquals(expected, actual);
    }

    @Test
    public void testEncodingTwo() {

        String expected = "a2bc2a2";

        String actual = RunLengthEncoding.encode("aabccaa");

        assertEquals(expected, actual);
    }
}
