package lesson;

public class App {

    public static void main(String[] args) {
        Talker talk[] = new Talker[2];
        talk[0] = new SayHello();
        talk[1] = new SayWorld();
        for(Talker t : talk){
            System.out.print(t.SaySomething() + " ");
        }
        System.out.println("");
    }
}
