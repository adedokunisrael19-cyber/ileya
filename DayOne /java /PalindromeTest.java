import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest{

    @Test
    public void testThatAnArrayIsPalindrome(){
    int [] number = {45, 0, 8, 0, 45};
    boolean expected = true;
    boolean actual = Palindrome.isPalindrome(number); 
    assertTrue(actual);
    }
}
