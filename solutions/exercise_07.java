import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise_07 {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100);
        List<Integer> even = new ArrayList<>();

        for (int i : a) {
            if (i % 2 == 0) {
                even.add(i);
                return;
            }
        }
        System.out.println("even numbers: " + even);
    }
}
