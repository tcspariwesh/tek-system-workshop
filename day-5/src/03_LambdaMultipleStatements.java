
interface Calculator {
    int multiply(int a, int b);
}

public class LambdaMultipleStatements {
    public static void main(String[] args) {
        Calculator calc = (a,b) -> {
            int result = a * b;
            return result;
        };
        System.out.println(calc.multiply(4,5));
    }
}
