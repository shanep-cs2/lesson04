package lesson04;

/**
 * Class that just returns "World" from its one public method
 */
public class SayWorld implements Talker{

    /**
     * Say "World"
     */
    @Override
    public String SaySomething() {
        return "World";
    }
    
}
