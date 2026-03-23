
import java.util.*;

public class LambdaWithCollections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java","Python","Go");
        names.forEach(name -> System.out.println(name));
    }
}
