package lesson04;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SayWorldTest {

    @Test
    public void methodReturnsWorld() {
        SayWorld hello = new SayWorld();
        assertEquals(hello.SaySomething(), "World");
    }
    
}
