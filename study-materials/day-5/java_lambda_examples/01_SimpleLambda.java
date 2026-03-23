
interface Greeting {
    void sayHello();
}

public class SimpleLambda {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello World");
        greet.sayHello();
    }
}
