import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayNumberTest {
    @Test
public void testThatCheckForTheAdditionOfANumber() {
    int[] arr = {8, 6, 12, 4, -2};
    int number = 6;
    // 8 + (-2) = 6, so we expect these two numbers
    int[] expected = {8, -2}; 
    int[] actual = ArrayNumber.ArrayCheck(number, arr);
    assertArrayEquals(expected, actual);
}
}


import org.jnit.jupiter.api.Test;

importorg.junit.jupiter.api.Assertions.*;

public class PerfectSquareTest {
    @Test
    public void testThatCheckIfANumberIsPerfectSquare{
     int[] numbers = {4, 7, 9, 10, 16, 18};
     int[] expected = {4,9,16};
     int[] actual = PerfectSquare.isPerfectSquare(numbers);
     AssertArrayEquals(expected, actual);
    }
}
