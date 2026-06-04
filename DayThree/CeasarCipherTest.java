
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CeasarCipherTest{  
    
     @Test
    public void testThatEncryptAWord(){
    String word = "HELLO";
    String expected = "KHOOR";
    String actual = CeasarCipher.getEncryption(word, 3);
    assertEquals(expected, actual);
    }
 
    @Test
    public void testThatDecryptAnUppercaseWord(){
    String word = "KHOOR";
    String expected = "HELLO";
    String actual = CeasarCipher.getDecryption(word, 3);
    assertEquals(expected, actual);
    }

}



