package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SayHelloTest {

    @Test
    public void sayHello(){
        SayHello hello = new SayHello();
        assertEquals(hello.SaySomething(), "Hello");
    }
}
