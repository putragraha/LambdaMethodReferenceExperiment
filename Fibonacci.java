import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibonacci(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);

        for (int i = 2; i < n; i++) {
            result.add(result.get(i - 1) + result.get(i - 2));
        }

        return result;
    }
}
