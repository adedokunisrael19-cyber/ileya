import org.jnit.jupiter.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MBTITest{
    @Test
    public void TestThatCheckIfAlIsA(){
    String[] response = {"A","A","A","A","A",
                "A","A","A","A","A",
                "A","A","A","A","A",
                "A","A","A","A","A"};
    String Expected = "ESTJ";
    String Actual = MBTI.printPersonalityType(response);
    }
    public void TestThatCheckIfAlIsB(){
    String[] response = 
                {
                "B","B","B","B","B",
                "B","B","B","B","B",
                "B","B","B","B","B",
                "B","B","B","B","B"
                  };
    String Expected = "ESTJ";
    String Actual = MBTI.printPersonalityType(response);
    }
     
}


