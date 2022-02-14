package lesson04;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SayHelloTest {

    @Test
    public void methodReturnsHello() {
        SayHello hello = new SayHello();
        assertEquals(hello.SaySomething(), "Hello");
    }   
}
