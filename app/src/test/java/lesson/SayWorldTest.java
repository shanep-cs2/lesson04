package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SayWorldTest {

    @Test
    public void sayWorld(){
        SayWorld world = new SayWorld();
        assertEquals(world.SaySomething(), "World");
    }
    
}
