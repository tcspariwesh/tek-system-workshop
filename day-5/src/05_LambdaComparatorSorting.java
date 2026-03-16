
import java.util.*;

public class LambdaComparatorSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,3,9,1);
        numbers.sort((a,b) -> a - b);
        System.out.println(numbers);
    }
}
