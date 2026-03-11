package day2.quiz;
class MathUtil {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}

public class Test {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        m.add(10, 20);
        m.add(10.5, 5.5);
    }
}
